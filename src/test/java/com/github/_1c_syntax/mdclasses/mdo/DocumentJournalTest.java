/*
 * This file is a part of MDClasses.
 *
 * Copyright © 2019 - 2020
 * Tymko Oleg <olegtymko@yandex.ru>, Maximov Valery <maximovvalery@gmail.com> and contributors
 *
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 * MDClasses is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * MDClasses is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with MDClasses.
 */
package com.github._1c_syntax.mdclasses.mdo;

import com.github._1c_syntax.mdclasses.metadata.additional.AttributeType;
import com.github._1c_syntax.mdclasses.metadata.additional.MDOType;
import com.github._1c_syntax.mdclasses.metadata.additional.ModuleType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentJournalTest extends AbstractMDOTest {
  DocumentJournalTest() {
    super(MDOType.DOCUMENT_JOURNAL);
  }

  @Override
  @Test
  void testEDT() {
    var mdo = getMDObjectEDT("DocumentJournals/ЖурналДокументов1/ЖурналДокументов1.mdo");
    checkBaseField(mdo, DocumentJournal.class, "ЖурналДокументов1",
      "c6743657-4787-40de-9a45-2493c630f626");
    checkForms(mdo);
    checkTemplates(mdo);
    checkCommands(mdo);
    checkAttributes(((MDObjectComplex) mdo).getAttributes(), 1, "DocumentJournal.ЖурналДокументов1",
      AttributeType.COLUMN);
    checkModules(((MDObjectBSL) mdo).getModules(), 1, "DocumentJournals/ЖурналДокументов1",
      ModuleType.ManagerModule);

  }

  @Override
  @Test
  void testDesigner() {
    var mdo = getMDObjectDesigner("DocumentJournals/ЖурналДокументов1.xml");
    checkBaseField(mdo, DocumentJournal.class, "ЖурналДокументов1",
      "c6743657-4787-40de-9a45-2493c630f626");
    checkForms(mdo);
    checkTemplates(mdo);
    checkCommands(mdo);
    checkAttributes(((MDObjectComplex) mdo).getAttributes(), 1, "DocumentJournal.ЖурналДокументов1",
      AttributeType.COLUMN);
    assertThat(((MDObjectBSL) mdo).getModules()).isEmpty();
  }

}
