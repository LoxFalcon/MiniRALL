/* Generated By:JJTree&JavaCC: Do not edit this line. lexicoTokenManager.java */
package analizador;
import java.io.*;
import java.util.Scanner;

/** Token Manager. */
public class lexicoTokenManager implements lexicoConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x300001feL) != 0L)
         {
            jjmatchedKind = 33;
            return 5;
         }
         if ((active0 & 0x2000000L) != 0L)
            return 1;
         return -1;
      case 1:
         if ((active0 & 0x300001beL) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 1;
            return 5;
         }
         if ((active0 & 0x40L) != 0L)
            return 5;
         return -1;
      case 2:
         if ((active0 & 0x200001b6L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 2;
            return 5;
         }
         if ((active0 & 0x10000008L) != 0L)
            return 5;
         return -1;
      case 3:
         if ((active0 & 0x20000134L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 3;
            return 5;
         }
         if ((active0 & 0x82L) != 0L)
            return 5;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 34:
         return jjStartNfaWithStates_0(0, 25, 1);
      case 40:
         return jjStopAtPos(0, 20);
      case 41:
         return jjStopAtPos(0, 21);
      case 42:
         return jjStopAtPos(0, 12);
      case 43:
         return jjStopAtPos(0, 11);
      case 45:
         return jjStopAtPos(0, 10);
      case 47:
         return jjStopAtPos(0, 13);
      case 59:
         return jjStopAtPos(0, 24);
      case 60:
         jjmatchedKind = 14;
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 61:
         jjmatchedKind = 9;
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 62:
         jjmatchedKind = 15;
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 91:
         return jjStopAtPos(0, 26);
      case 93:
         return jjStopAtPos(0, 27);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x10000050L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x8L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 123:
         return jjStopAtPos(0, 22);
      case 125:
         return jjStopAtPos(0, 23);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 61:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         else if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0xaL);
      case 102:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(1, 6, 5);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000080L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000010L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x4L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x122L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x4L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x10L);
      case 114:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(2, 3, 5);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 116:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 28, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 5);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 110:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(3, 1, 5);
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x4L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x10L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 5);
         break;
      case 116:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(4, 2, 5);
         else if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(4, 4, 5);
         else if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 5);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 11;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if ((0x3ff000100000000L & l) != 0L)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 2:
                  if ((0xfff400100000000L & l) != 0L)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 3:
                  if (curChar == 34 && kind > 32)
                     kind = 32;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAddStates(0, 2);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(7);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 9:
                  if (curChar == 46)
                     jjCheckNAdd(10);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(10);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(5);
                  break;
               case 1:
               case 2:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   7, 8, 9, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\155\141\151\156", "\143\157\156\163\164", "\166\141\162", 
"\151\156\160\165\164", "\160\162\151\156\164", "\151\146", "\145\154\163\145", 
"\167\150\151\154\145", "\75", "\55", "\53", "\52", "\57", "\74", "\76", "\74\75", "\76\75", "\75\75", 
"\41\75", "\50", "\51", "\173", "\175", "\73", "\42", "\133", "\135", "\151\156\164", 
"\146\154\157\141\164", null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3ffffffffL, 
};
static final long[] jjtoSkip = {
   0x7c00000000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[11];
static private final int[] jjstateSet = new int[22];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public lexicoTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public lexicoTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 11; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 1 :
        image.append(jjstrLiteralImages[1]);
        lengthOfMatch = jjstrLiteralImages[1].length();
                       if(lexico.bandera)System.out.println("MAIN - Palabra Reservada: " + image);
         break;
      case 2 :
        image.append(jjstrLiteralImages[2]);
        lengthOfMatch = jjstrLiteralImages[2].length();
                              if(lexico.bandera)System.out.println("CONSTANTE - Palabra Reservada" + image);
         break;
      case 3 :
        image.append(jjstrLiteralImages[3]);
        lengthOfMatch = jjstrLiteralImages[3].length();
                           if(lexico.bandera)System.out.println("VARIABLE - Palabra Reservada" + image);
         break;
      case 4 :
        image.append(jjstrLiteralImages[4]);
        lengthOfMatch = jjstrLiteralImages[4].length();
                          if(lexico.bandera)System.out.println("INPUT - Palabra Reservada: " + image);
         break;
      case 5 :
        image.append(jjstrLiteralImages[5]);
        lengthOfMatch = jjstrLiteralImages[5].length();
                          if(lexico.bandera)System.out.println("PRINT - Palabra Reservada: " + image);
         break;
      case 6 :
        image.append(jjstrLiteralImages[6]);
        lengthOfMatch = jjstrLiteralImages[6].length();
                    if(lexico.bandera)System.out.println("IF - Palabra Reservada: " + image);
         break;
      case 7 :
        image.append(jjstrLiteralImages[7]);
        lengthOfMatch = jjstrLiteralImages[7].length();
                        if(lexico.bandera)System.out.println("ELSE - Palabra Reservada: " + image);
         break;
      case 8 :
        image.append(jjstrLiteralImages[8]);
        lengthOfMatch = jjstrLiteralImages[8].length();
                          if(lexico.bandera)System.out.println("WHILE - Palabra Reservada: " + image);
         break;
      case 9 :
        image.append(jjstrLiteralImages[9]);
        lengthOfMatch = jjstrLiteralImages[9].length();
                          if(lexico.bandera)System.out.println("ASIGNACION - Operador Matem\ufffdtico: " + image);
         break;
      case 10 :
        image.append(jjstrLiteralImages[10]);
        lengthOfMatch = jjstrLiteralImages[10].length();
                      if(lexico.bandera)System.out.println("RESTA - Operador Matem\ufffdtico: " + image);
         break;
      case 11 :
        image.append(jjstrLiteralImages[11]);
        lengthOfMatch = jjstrLiteralImages[11].length();
                     if(lexico.bandera)System.out.println("SUMA - Operador Matem\ufffdticos: " + image);
         break;
      case 12 :
        image.append(jjstrLiteralImages[12]);
        lengthOfMatch = jjstrLiteralImages[12].length();
                               if(lexico.bandera)System.out.println("MULTIPLICACION - Operador Matem\ufffdtico: " + image);
         break;
      case 13 :
        image.append(jjstrLiteralImages[13]);
        lengthOfMatch = jjstrLiteralImages[13].length();
                         if(lexico.bandera)System.out.println("DIVISION - Operador Matem\ufffdtico: " + image);
         break;
      case 14 :
        image.append(jjstrLiteralImages[14]);
        lengthOfMatch = jjstrLiteralImages[14].length();
                     if(lexico.bandera)System.out.println("MENOR - Comparador: " + image);
         break;
      case 15 :
        image.append(jjstrLiteralImages[15]);
        lengthOfMatch = jjstrLiteralImages[15].length();
                      if(lexico.bandera)System.out.println("MAYOR - Comparador: " + image);
         break;
      case 16 :
        image.append(jjstrLiteralImages[16]);
        lengthOfMatch = jjstrLiteralImages[16].length();
                            if(lexico.bandera)System.out.println("MENORIGUAL - Comparador: " + image);
         break;
      case 17 :
        image.append(jjstrLiteralImages[17]);
        lengthOfMatch = jjstrLiteralImages[17].length();
                            if(lexico.bandera)System.out.println("MAYORIGUAL - Comparador: " + image);
         break;
      case 18 :
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
                       if(lexico.bandera)System.out.println("IGUAL - Comparador: " + image);
         break;
      case 19 :
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
                           if(lexico.bandera)System.out.println("DIFERENTE - Comparador: " + image);
         break;
      case 20 :
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                       if(lexico.bandera)System.out.println("PARENTA - Delimitador: " + image);
         break;
      case 21 :
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
                        if(lexico.bandera)System.out.println("PARENTC - Delimitador: " + image);
         break;
      case 22 :
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
                       if(lexico.bandera)System.out.println("LLAVEA - Delimitador: " + image);
         break;
      case 23 :
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
                       if(lexico.bandera)System.out.println("LLAVEC - Delimitador: " + image);
         break;
      case 24 :
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
                      if(lexico.bandera)System.out.println("PCOMA - Delimitador: " + image);
         break;
      case 25 :
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
                       if(lexico.bandera)System.out.println("DCOMA - Delimitador: " + image);
         break;
      case 26 :
        image.append(jjstrLiteralImages[26]);
        lengthOfMatch = jjstrLiteralImages[26].length();
                          if(lexico.bandera)System.out.println("DCORCHETE - Delimitador: " + image);
         break;
      case 27 :
        image.append(jjstrLiteralImages[27]);
        lengthOfMatch = jjstrLiteralImages[27].length();
                          if(lexico.bandera)System.out.println("SCORCHETE - Delimitador: " + image);
         break;
      case 28 :
        image.append(jjstrLiteralImages[28]);
        lengthOfMatch = jjstrLiteralImages[28].length();
                    if(lexico.bandera)System.out.println("INT - Tipo de dato: " + image);
         break;
      case 29 :
        image.append(jjstrLiteralImages[29]);
        lengthOfMatch = jjstrLiteralImages[29].length();
                           if(lexico.bandera)System.out.println("FLOAT - Tipo de dato: " + image);
         break;
      case 30 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                  if(lexico.bandera)System.out.println("Numero entero: " + image);
         break;
      case 31 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                      if(lexico.bandera)System.out.println("N\ufffdmero Decimal: " + image);
         break;
      case 32 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                                              if(lexico.bandera)System.out.println("Cadena de caracteres: " + image);
         break;
      case 33 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                              if(lexico.bandera)System.out.println("Identificador: " + image);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
