package DataBase;


import org.omg.CORBA.Context;


/**
 * Created by CarineYoeurng on 25/02/2016.
 */
public class DataBase extends SQLiteOpenHelper {

        //Initialise la table Joueur
        public static final String JOUEUR_TABLE_NAME = "Joueur";
        public static final String ID_JOUEUR = "idJoueur";
        public static final String NOM_JOUEUR = "nomJoueur";

        //Initialise la table Personnage
        public static final String PERSONNAGE_TABLE_NAME = "Personnage";
        public static final String ID_PERSONNAGE = "idPersonnage";
        public static final String NOM_PERSONNAGE = "nomPersonnage";

        //Initialise la table Score
        public static final String SCORE_TABLE_NAME = "Score";
        public static final String ID_SCORE = "idScore";
        public static final String SCORE = "scoreTotal";

        //Initialise la table Objet
        public static final String OBJET_TABLE_NAME = "Objet";
        public static final String ID_OBJET = "idObjet";
        public static final String TYPE_OBJET = "typeObjet";
        public static final String APPORT_OBJET = "apportObjet";

        //Création de la table Personnage
        public static final String PERSONNAGE_TABLE_CREATE =
                "CREATE TABLE " + PERSONNAGE_TABLE_NAME + " (" +
                        ID_PERSONNAGE + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        NOM_PERSONNAGE + " TEXT);";

        //Création de la table Objet
        public static final String OBJET_TABLE_CREATE =
                "CREATE TABLE " + OBJET_TABLE_NAME + " (" +
                        ID_OBJET + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        TYPE_OBJET + " TEXT" +
                        APPORT_OBJET + "INTEGER);";

        //Création de la table Joueur
        public static final String JOUEUR_TABLE_CREATE =
                "CREATE TABLE " + JOUEUR_TABLE_NAME + " (" +
                        ID_JOUEUR+ " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        NOM_JOUEUR + " TEXT);";

        //Création de la table Score
        public static final String SCORE_TABLE_CREATE =
                "CREATE TABLE " + SCORE_TABLE_NAME + " (" +
                        ID_SCORE + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        SCORE + " INTEGER);";


        /**
         * Appel la méthode super() de SQLiteOpenHelper en précisant le nom de la base ainsi que sa version actuelle
         * @param context
         * @param name
         * @param factory
         * @param version
         */
        public DataBase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
                super(context, name, factory, version);
        }

        //Permet accéder à une base de données qui n'est pas encore créée.
        @Override
        public void onCreate(SQLiteDatabase db) {
                db.execSQL(PERSONNAGE_TABLE_CREATE);
                db.execSQL(OBJET_TABLE_CREATE);
                db.execSQL(JOUEUR_TABLE_CREATE);
                db.execSQL(SCORE_TABLE_CREATE);

                onCreate(db);
        }


}
