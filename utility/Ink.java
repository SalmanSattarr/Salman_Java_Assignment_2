package utility;

import warrior.Warrior;

public class Ink {

  public Ink() {
    // do nothing
  } // constructor

  // Welcome Message
  public void welcomeMessage() {
    System.out.println("""
      __        __             _             ____   ___ ____  _  _
      \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |
       \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_
        \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|
         \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|
    """);
  }

  // Warrior Menu
  public void printWarriorMenu() {
    System.out.println("""
      /\\_[]_/\\
                  |] _||_ [|
           ___     \\/ || \\/
          /___\\       ||
         (|0 0|)      ||
       __/{\\U/}\\_ ___/vvv
      / \\  {~}   / _|_P|
      | /\\  ~   /_/   []
      |_| (____)
      \\_/______\\        -edias-
         _\\_||_/_           
    snd (_,_||_,_)
      ^^^ ^^^
    """);
    System.out.println("Select a Type: \n1) Human\n2) Elf\n3) Orc");
  }

  // Weapon Menu
  public void printWeaponMenu() {
    System.out.println("""
       /\\
                /  |
  *            /  /________________________________________________
 (O)77777777777)  7                                                `~~--__
8OO>>>>>>>>>>>>] <===========================================>          __-
 (O)LLLLLLLLLLL)  L________________________________________________.--~~
  *            \\  \\
                \\  |
                 \\/
""");
    System.out.println("Select a Weapon: \n1) Dagger\n2) Sword\n3) Axe");
  }

  // Armor Menu
  public void printArmourMenu() {
    System.out.println("""
                  /¯¯\\
                  \\__/
                   ||
                   ||
                  |  |
                  |  |
                  |  |
                  |  |
                  |  |
                  |  |
              .--.----.--.
            .-----\\__/-----.
    ___---¯¯////¯¯|\\/|¯¯\\\\¯¯---___
 /¯¯ __O_--////   |  |   \\\\--_O__ ¯¯\\
| O?¯      ¯¯¯    |  |    ¯¯¯      ¯?O |
|  '    _.-.      |  |      .-._    '  |
|O|    ?..?      ./  \\.      ?..?    |O|
| |     '?. .-.  | /\\ |  .-. .?'     | |
| ---__  ¯?__?  /|\\¯¯/|\\  ?__?¯  __--- |
|O     \\         ||\\/ |         /     O|
|       \\  /¯?_  ||   |  _?¯\\  /       |
|       / /    - ||   | -    \\ \\       |
|O   __/  | __   ||   |   __ |  \\__   O|
| ---     |/  -_/||   |\\_-  \\|     --- |
|O|            \\ ||   | /            |O|
\\ '              ||   |        ^~DLF ' /
 \\O\\    _-¯?.    ||   |    .?¯-_    /O/
  \\ \\  /  /¯¯¯?  ||   |  ?¯¯¯\\  \\  / /
   \\O\\/   |      ||   |      |   \\/O/
    \\     |      ||   |      |     /
     '.O  |_     ||   |     _|  O.'
        '._O'.__/||   |\\__.'O_.'
           '._ O ||   | O _.'
              '._||   |_.' """);
    System.out.println("Armour Pick: \n1) Leather\n2) Chainmail\n3) Platemail");
  }

  // Attack Menu
  public void printAttackMenu() {
    System.out.println("""
                                                       |
                                                        \\.
                                                        /|.
                                                      /  `|.
                                                    /     |.
                                                  /       |.
                                                /         `|.
                                              /            |.
                                            /              |.
     __                                 /                  `|.
      -\\                              /                     |.
        \\\\                          /                       |.
          \\\\                      /                         |.
           \\|                   /                           |\\
             \\#####\\          /                             ||
         ==###########>     /                               ||
          \\##==      \\    /                                 ||
     ______ =       =|__/___                                ||
 ,--' ,----`-,__ ___/'  --,-`-==============================##==========>
\\               '        ##_______ ______   ______,--,____,=##,__
 `,    __==    ___,-,__,--'#'  ==='      `-'              | ##,-/
   `-,____,---'       \\####\\              |        ____,--\\_##,/
       #_              |##   \\  _____,---==,__,---'         ##
        #              ]===--==\\                            ||
        #,             ]         \\                          ||
         #_            |           \\                        ||
          ##_       __/'             \\                      ||
           ####='     |                \\                    |/
            ###       |                  \\                  ||
            ##       _'                    \\                ||
           ###=======]                       \\              ||
          ///        |                         \\           ,|.
          //         |                           \\         |.
                                                   \\      ,|.
                                                     \\    |.
                                                       \\  |.
                                                         \\|.
                                                         /.
                                                        |""");
    System.out.println("Attack Type: \n1) Normal Attack\n2) Special Attack");
  }

  // Print Player and Enemy Stats
  public void printStats(Warrior player, Warrior enemy) {
    System.out.println("Player: " + player.getWarriorType() + " - Health: " + player.getHealth() + " - Strength: " + player.getStrength() + " - Dexterity: " + player.getDexterity());
    System.out.println("Enemy: " + enemy.getWarriorType() + " - Health: " + enemy.getHealth() + " - Strength: " + enemy.getStrength() + " - Dexterity: " + enemy.getDexterity());
  }

  // Game Over Message
  public void printGameOver(String winner) {
    System.out.println("Game Over! " + winner + " is the winner!");
  }

} // class
