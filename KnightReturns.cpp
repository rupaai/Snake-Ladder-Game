#include <stdio.h>
#include <queue>

using namespace std;

int visited[100][100] ;
int BFS(int ky,int kx,int hx,int hy);
void printPath(int hx,int hy,int kx, int ky);
int dy[] = {2, 2,-2,-2, 1,-1, 1,-1};
int dx[] = {1,-1, 1,-1, 2, 2,-2,-2};
int path[100][100][5];
int dist[100][100];
int r, c, i;
int main()
{
    int n,tx,ty;
    int kx, ky, hx, hy;
    freopen("KnightReturns.txt","r",stdin);

    printf("Enter Dimensions of Grid: ");
    scanf("%d%d", &r, &c);



    printf("\nEnter Number of Trees: ");
    scanf("%d", &n);

    printf("\nEnter position of Trees:\n");

    for(i=0; i<n; i++)
    {
        scanf("%d%d", &tx, &ty);
        visited[ty][tx] = 1;
    }

    printf("Enter Knight's Position: ");
    scanf("%d%d", &kx, &ky);

    printf("Enter Home Position: ");
    scanf("%d%d", &hx, &hy);

    if(BFS(ky, kx, hx, hy))
    {
        printf("Yes - Knight can reach home in %d steps. The path is:\n",dist[hy][hx]);
        printPath(hx,hy, kx, ky);
    }

    else
        printf("There is no path\n");

    return 0;
}

int BFS(int ky,int kx,int hx,int hy)
{
    queue<int> Q;

    Q.push(kx);
    Q.push(ky);

    visited[ky][kx] = 1;
    dist[ky][kx] = 0;

    while(!Q.empty())
    {
        int x1 = Q.front();
        Q.pop();
        int y1 = Q.front();
        Q.pop();

        for(i=0; i<8; i++)
        {
            int x = x1+dx[i];
            int y = y1+dy[i];

            if(x>=0&&x<c&&y>=0&&y<r&&visited[y][x]!=1)
            {
                visited[y][x]=1;
                dist[y][x] = dist[y1][x1] + 1;
                path[y][x][0] = x1;
                path[y][x][1] = y1;

                Q.push(x);
                Q.push(y);

                if(x == hx && y == hy)
                {
                    return 1;
                }
            }
        }
    }

    return 0;
}


void printPath(int hx,int hy,int kx,int ky)
{
    if(hx == kx && hy == ky )
    {
        printf("\n%d %d\n", kx, ky);
        return;
    }
    printPath(path[hy][hx][0], path[hy][hx][1], kx, ky);

    printf("\n%d %d", hx, hy);
}




