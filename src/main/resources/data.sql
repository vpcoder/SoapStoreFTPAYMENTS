INSERT INTO user (id,login,password) VALUES (0, 'admin','25d55ad283aa400af464c76d713c07ad');
INSERT INTO user (id,login,password) VALUES (1, 'achebukov','25d55ad283aa400af464c76d713c07ad');
INSERT INTO user (id,login,password) VALUES (2, 'dbutorina','25d55ad283aa400af464c76d713c07ad');
INSERT INTO user (id,login,password) VALUES (3, 'user1','25d55ad283aa400af464c76d713c07ad');
INSERT INTO user (id,login,password) VALUES (4, 'user2','25d55ad283aa400af464c76d713c07ad');

INSERT INTO request (id, user_id, method, name, body) VALUES (0, 0, 'dsPrimaryDocumentSetListBlockDQ', 'Проверка преодоления блокировок на счёте (преодолимая блокировка)', '<?xml version="1.0" encoding="UTF-8"?>
<BODY version="2.11">
	<PrimaryDocumentList type="java.util.List">
		<ListItems>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<PrimaryDocumentID type="java.lang.Long">2321965</PrimaryDocumentID>
				<BranchID type="java.lang.Long">2007</BranchID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<OperationDirection type="java.lang.Integer">2</OperationDirection>
				<OvercomingBlockFlag type="java.lang.String">Y</OvercomingBlockFlag>
				<RequestMode type="java.lang.String">Full</RequestMode>
			</Item>
		</ListItems>
	</PrimaryDocumentList>
	<BlockList type="java.util.List">
		<ListItems>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">GBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">SBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">MBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">KBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">RBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">PBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">17</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">92</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">93</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">OBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
		</ListItems>
	</BlockList>
</BODY>
');

INSERT INTO request (id, user_id, method, name, body) VALUES (1, 0, 'dsPrimaryDocumentSetListBlockDQ', 'Проверка преодоления блокировок на счёте (непреодолимая блокировка)', '<?xml version="1.0" encoding="UTF-8"?>
<BODY version="2.11">
	<PrimaryDocumentList type="java.util.List">
		<ListItems>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<PrimaryDocumentID type="java.lang.Long">2321965</PrimaryDocumentID>
				<BranchID type="java.lang.Long">2007</BranchID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<OperationDirection type="java.lang.Integer">2</OperationDirection>
				<OvercomingBlockFlag type="java.lang.String">N</OvercomingBlockFlag>
				<RequestMode type="java.lang.String">Full</RequestMode>
			</Item>
		</ListItems>
	</PrimaryDocumentList>
	<BlockList type="java.util.List">
		<ListItems>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">GBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">SBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">MBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">KBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">RBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">PBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">17</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">92</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">93</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">OBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
		</ListItems>
	</BlockList>
</BODY>
');

INSERT INTO request (id, user_id, method, name, body) VALUES (2, 0, 'dsPrimaryDocumentSetListBlockDQ', 'Проверка преодоления блокировок на счёте (непреодолимая блокировка)', '<?xml version="1.0" encoding="UTF-8"?>
<BODY version="2.11">
	<PrimaryDocumentList type="java.util.List">
		<ListItems>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<PrimaryDocumentID type="java.lang.Long">2321965</PrimaryDocumentID>
				<BranchID type="java.lang.Long">2007</BranchID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<OperationDirection type="java.lang.Integer">2</OperationDirection>
				<OvercomingBlockFlag type="java.lang.String">N</OvercomingBlockFlag>
				<RequestMode type="java.lang.String">Full</RequestMode>
			</Item>
		</ListItems>
	</PrimaryDocumentList>
	<BlockList type="java.util.List">
		<ListItems>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">GBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">SBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">MBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">KBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">RBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">PBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">17</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">92</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">93</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
			<Item type="java.util.Map">
				<RequestID type="java.lang.String">E28E97AE4ACE49B9A051275B355A5AE0</RequestID>
				<AccountNumber type="java.lang.String">40702810396093000777</AccountNumber>
				<BankBlockType type="java.lang.String">OBL</BankBlockType>
				<BlockInfo type="java.lang.Integer">1</BlockInfo>
			</Item>
		</ListItems>
	</BlockList>
</BODY>
');

INSERT INTO request (id, user_id, method, name, body) VALUES (4, 0, 'dsPaymentOrderMassInsert2', 'Рублёвый платёжный документ (внутренний)', '<?xml version="1.0" encoding="UTF-8"?>
<BODY version="2.11">
  <BaseAttributeList type="java.util.List">
    <ListItems>
      <Item type="java.util.Map">
        <PayerAccountNumber type="java.lang.String">40702810296990008561</PayerAccountNumber>
        <Number type="java.lang.String">123</Number>
        <Priority type="java.lang.String">5</Priority>
        <Amount type="java.math.BigDecimal">33</Amount>
        <BranchBrief type="java.lang.String">R19</BranchBrief>
        <Purpose type="java.lang.String">Проверка исполнения платежного поручения</Purpose>
        <PaymentPrecedence type="java.lang.Integer">75</PaymentPrecedence>
        <ExternalGUID type="java.lang.String">R19-1210609-0301199</ExternalGUID>
        <LinkID type="java.lang.Long">0</LinkID>
        <PayeeAccountNumber type="java.lang.String">40702810596920008561</PayeeAccountNumber>
      </Item>
    </ListItems>
  </BaseAttributeList>
</BODY>');

INSERT INTO request (id, user_id, method, name, body) VALUES (5, 0, 'dsPaymentOrderMassInsert2', 'Рублёвый платёжный документ (внутренний физлицо)', '<?xml version="1.0" encoding="UTF-8"?>
<BODY version="2.11">
  <BaseAttributeList type="java.util.List">
    <ListItems>
      <Item type="java.util.Map">
        <PayerAccountNumber type="java.lang.String">40817810196097777777</PayerAccountNumber>
        <Number type="java.lang.String">123</Number>
        <Priority type="java.lang.String">5</Priority>
        <Amount type="java.math.BigDecimal">33</Amount>
        <BranchBrief type="java.lang.String">R19</BranchBrief>
        <Purpose type="java.lang.String">Проверка исполнения платежного поручения</Purpose>
        <PaymentPrecedence type="java.lang.Integer">75</PaymentPrecedence>
        <ExternalGUID type="java.lang.String">R19-1210609-0301199</ExternalGUID>
        <LinkID type="java.lang.Long">0</LinkID>
        <PayeeAccountNumber type="java.lang.String">40817810796097777779</PayeeAccountNumber>
      </Item>
    </ListItems>
  </BaseAttributeList>
</BODY>');

INSERT INTO request (id, user_id, method, name, body) VALUES (6, 0, 'dsPaymentOrderMassInsert2', 'Рублёвый платёжный документ (внутренний 13 значные счета)', '<?xml version="1.0" encoding="UTF-8"?>
<BODY version="2.11">
  <BaseAttributeList type="java.util.List">
    <ListItems>
      <Item type="java.util.Map">
        <LinkID type="java.lang.Long">0</LinkID>
        <BranchID type="java.lang.Long">2002</BranchID>
        <Amount type="java.math.BigDecimal">10</Amount>
        <Direction type="java.lang.Integer">4</Direction>
        <OperationCode type="java.lang.String">01</OperationCode>
        <Number type="java.lang.String">27278</Number>
        <Purpose type="java.lang.String">Тестовый внутренний платеж ё Ё проверка №</Purpose>
        <PayerINN type="java.lang.String">7710173191</PayerINN>
        <Priority type="java.lang.String">2</Priority>
        <PaymentKind type="java.lang.String">NONE</PaymentKind>
        <PayerInstitutionName type="java.lang.String">ПАО РОСБАНК</PayerInstitutionName>
        <PayeeInstitutionBIC type="java.lang.String">044030778</PayeeInstitutionBIC>
        <PayeeInstitutionName type="java.lang.String">СЕВЕРО-ЗАПАДНЫЙ ФИЛИАЛ ПАО РОСБАНК</PayeeInstitutionName>
        <PaymentKindID type="java.lang.Long">0</PaymentKindID>
        <PaymentKindBrief type="java.lang.String"/>
        <PayeeInstitutionAccountNumber type="java.lang.String">30101810100000000778</PayeeInstitutionAccountNumber>
        <PayerInstitutionAccountNumber type="java.lang.String">30101810000000000256</PayerInstitutionAccountNumber>
        <PaymentAmount type="java.math.BigDecimal">10</PaymentAmount>
        <PaymentPrecedence type="java.lang.Integer">75</PaymentPrecedence>
      </Item>
    </ListItems>
  </BaseAttributeList>
  <ExtraAttributeList type="java.util.List">
    <ListItems>
      <Item type="java.util.Map">
        <LinkID type="java.lang.Double">0.0</LinkID>
        <PaymentOrderID type="java.lang.Long">0.0</PaymentOrderID>
        <Name type="java.lang.String">PayeeExternalAccountNumber</Name>
        <Value type="java.lang.String">9721J57981881</Value>
      </Item>
      <Item type="java.util.Map">
        <LinkID type="java.lang.Double">0.0</LinkID>
        <PaymentOrderID type="java.lang.Long">0.0</PaymentOrderID>
        <Name type="java.lang.String">PayerExternalAccountNumber</Name>
        <Value type="java.lang.String">9721J57981001</Value>
      </Item>
    </ListItems>
  </ExtraAttributeList>
</BODY>');
