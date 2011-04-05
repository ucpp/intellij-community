/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.plugins.groovy.lang.lexer;

import com.intellij.psi.tree.TokenSet;

/**
 * Utility classdef, tha contains various useful TokenSets
 *
 * @author ilyas
 */
public abstract class TokenSets implements GroovyTokenTypes {

  public static TokenSet COMMENTS_TOKEN_SET = TokenSet.create(
      mSL_COMMENT,
      mML_COMMENT,
      GROOVY_DOC_COMMENT
  );
  public static final TokenSet ALL_COMMENT_TOKENS = TokenSet.orSet(COMMENTS_TOKEN_SET, GROOVY_DOC_TOKENS);

  public static TokenSet SEPARATORS = TokenSet.create(
      mNLS,
      mSEMI
  );


  public static TokenSet WHITE_SPACE_TOKEN_SET = TokenSet.create(
      mWS,
      mGDOC_WHITESPACE
  );

  public static TokenSet SUSPICIOUS_EXPRESSION_STATEMENT_START_TOKEN_SET = TokenSet.create(
      mMINUS,
      mPLUS,
      mLBRACK,
      mLPAREN,
      mLCURLY
  );

  public static final TokenSet NUMBERS = TokenSet.create(mNUM_INT,
      mNUM_BIG_DECIMAL,
      mNUM_BIG_INT,
      mNUM_DOUBLE,
      mNUM_FLOAT,
      mNUM_LONG);


  public static final TokenSet CONSTANTS = TokenSet.create(
      mNUM_INT,
      mNUM_BIG_DECIMAL,
      mNUM_BIG_INT,
      mNUM_DOUBLE,
      mNUM_FLOAT,
      mNUM_LONG,
      kTRUE,
      kFALSE,
      kNULL,
      mSTRING_LITERAL,
      mGSTRING_LITERAL,
      mREGEX_LITERAL
  );

  public static final TokenSet BUILT_IN_TYPE = TokenSet.create(
      kVOID,
      kBOOLEAN,
      kBYTE,
      kCHAR,
      kSHORT,
      kINT,
      kFLOAT,
      kLONG,
      kDOUBLE
  );

  public static final TokenSet PROPERTY_NAMES = TokenSet.create(mIDENT, mSTRING_LITERAL, mGSTRING_LITERAL);

  public static TokenSet REFERENCE_NAMES = TokenSet.orSet(KEYWORDS, PROPERTY_NAMES, NUMBERS);
  public static TokenSet REFERENCE_NAMES_WITHOUT_NUMBERS = TokenSet.orSet(KEYWORDS, PROPERTY_NAMES);


  public static TokenSet VISIBILITY_MODIFIERS = TokenSet.create(
      kPRIVATE,
      kPROTECTED,
      kPUBLIC
  );

  public static TokenSet MODIFIERS = TokenSet.create(
      kABSTRACT,
      kPRIVATE,
      kPUBLIC,
      kPROTECTED,
      kSTATIC,
      kTRANSIENT,
      kFINAL,
      kABSTRACT,
      kNATIVE,
      kSYNCHRONIZED,
      kSTRICTFP,
      kVOLATILE,
      kSTRICTFP,
      kDEF
  );

  public static TokenSet STRING_LITERALS = TokenSet.create(
      mSTRING_LITERAL,
      mREGEX_LITERAL,
      mGSTRING_LITERAL,
      mGSTRING_CONTENT,
      mGSTRING_BEGIN,
      mGSTRING_END
  );

  public static TokenSet FOR_IN_DELIMITERS = TokenSet.create(kIN, mCOLON);

  public static final TokenSet RELATIONS = TokenSet.create(
          mLT,
          mGT,
          mLE,
          mGE,
          kIN
  );
}
