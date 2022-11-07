package com.kob.backend.consumer.utils;

import java.util.Random;

public class Game {
    final private Integer rows, cols, inner_walls_count;
    final private int [][] g;
    final private static int[][] dir = {{1, 0}, {0, -1}, {0, 1}, {-1, 0}};

    public Game(Integer rows, Integer cols, Integer inner_walls_count){
        this.rows = rows;
        this.cols = cols;
        this.inner_walls_count = inner_walls_count;
        this.g = new int[rows][cols];
    }

    public int[][]getG(){
        return g;
    }

    private boolean check_connectivity(int sx, int sy, int tx, int ty){

        if(sx == tx && sy == ty) return true;
        g[sx][sy] = 1;
        for(int i = 0; i < 4; ++ i){
            int dx = sx + dir[i][0], dy = sy + dir[i][1];
            if(dx < 0 || dx >= this.rows || dy < 0 || dy >= this.cols) continue;
            if(g[dx][dy] == 1) continue;

            if(check_connectivity(dx, dy, tx, ty)) {
                g[sx][sy] = 0;
                return true;
            }
        }
        g[sx][sy] = 0;
        return false;
    }

    // 画地图;
    private Boolean draw(){
        for(int i = 0; i < this.rows; ++ i){
            for(int j = 0; j < this.cols; ++ j){
                g[i][j] = 0;
            }
        }
        for(int r = 0; r < this.rows; ++ r){
            g[r][0] =  g[r][this.cols - 1] = 1;
        }

        for(int c = 0; c < this.cols; ++ c){
            g[0][c] = g[this.rows - 1][c] = 1;
        }

        Random random = new Random();
        for(int i = 0; i < this.inner_walls_count / 2; ++ i){
            for(int j = 0; j < 1000; ++ j){
                int r = random.nextInt(this.rows);
                int c = random.nextInt(this.cols);
                if(g[r][c] == 1 || g[this.rows - 1 - r][this.cols - 1 - c] == 1) continue;
                if((r == this.rows - 2 && c == 1) || (r == 1 && c == this.cols - 2)) continue;
                g[r][c] = g[this.rows - 1 - r][this.cols - 1 - c] = 1;
                break;
            }
        }
        return check_connectivity(this.rows - 2, 1, 1, this.cols - 2);


    }

    public void createGameMap(){
        for(int i = 0; i < 1000; ++ i){
            if(draw()) break;
        }
    }
}
