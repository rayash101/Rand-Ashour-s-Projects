#include <stdio.h> 
#include <unistd.h>
#include <stdlib.h>
#include <dirent.h> 
#include <string.h>
#include <unistd.h>
#include <sys/stat.h>
#include <ctype.h>
#include <sys/wait.h>
#include <errno.h>

int Words(const char *filename){
  char ch; 
  int words = 0;
  int inWord = 0; 
  FILE *file = fopen(filename, "r");
  if (file == NULL) 
  {
    printf("Error opening file.\n");
    return -1;
  }
  while ((ch = fgetc(file)) != EOF) 
  { 
    if (isspace(ch)) 
        { 
            inWord = 0; 
        } 
        else if (!inWord) 
        { 
            inWord = 1;
            words++; 
        } 
    }
    fclose(file); 
    return words;
}

void traversal(const char *mon, int lev){
    struct dirent *dp;
    struct stat file_stat;
    DIR *dir = opendir(mon);
    if (dir == NULL) {
        perror("opendir");
        return;
}
    while ((dp = readdir(dir)) != NULL) {
      if (strcmp(dp->d_name, ".") == 0 || strcmp(dp->d_name, "..") == 0) {
        continue;
      }
          char path[1024];
          snprintf(path, sizeof(path), "%s/%s", mon, dp->d_name);
          if (stat(path, &file_stat) != 0) {
            perror("Error");
            continue; 
            }
            pid_t p = fork();
            if(p<0){
              perror("fork fail");
              exit(1);
            }
            if (p == 0) {
              if (S_ISDIR(file_stat.st_mode)) {
                traversal(path, lev + 1);
            }
            else{
              printf("Filename: %s\n", dp->d_name);
              printf("Size: %ld bytes\n", file_stat.st_size);
              if (strstr(dp->d_name, ".txt")) {
                int wordCount = Words(path);
                if (wordCount != -1) {
                    printf("Words: %d", wordCount);
                } else {
                    printf("Error");
                }
            }
            printf("\n");
        }
        exit(0);  
    } else { 
        wait(NULL);  
            }
          }
  closedir(dir);
      }

int main(int argc, char *argv[]){
  struct stat s;
  if (argc != 2)
     {
         fprintf(stderr,"no args");
         return 1;
     }
     int err = stat("Error", &s);
     if(err==-1) {
      if(ENOENT == errno) {
      } else {
        perror("stat");
        exit(1);
    }
} else {
    if(S_ISDIR(s.st_mode)) {
    } else {
    }
}
  traversal(argv[1], 0);
    return 0;
}