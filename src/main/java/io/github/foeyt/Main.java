package io.github.foeyt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("是否关闭进程(y/N)：");
            String stopThread = scanner.next();
            if (stopThread.equals("y")) {
                Thread.currentThread().stop();
            }

            scanner = new Scanner(System.in);
            System.out.print("输入要进行的操作(搜索模式：s, 歌单模式：m, 查看播放列表：p)：");
            String mode = scanner.next();
            if (mode.equals("s")) {
                scanner = new Scanner(System.in);
                System.out.print("输入要搜索的歌曲名：");
                String songName = scanner.nextLine();
                MPlayer3.printSearchResult(songName);

                scanner = new Scanner(System.in);
                System.out.print("输入要选择的歌曲名：");
                int userChoice = scanner.nextInt();
                MPlayer3.addToList(songName, userChoice);
            } else if (mode.equals("m")) {
                scanner = new Scanner(System.in);
                System.out.print("输入你要的歌单ID：");
                long id = scanner.nextLong();
                MPlayer3.printNetMusicPlayingList(id);
            } else if (mode.equals("p")) {
                MPlayer3.printPlayingList();
            }

            scanner = new Scanner(System.in);
            System.out.print("点歌是否完毕(y/N)：");
            String over = scanner.next();
            if (over.equals("y")) {
                MPlayer3.playMusicList();
            }
        }
    }
}