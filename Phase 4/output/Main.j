.class public Main
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
.method public <init>()V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		aconst_null
		astore 1
		new A
		dup
		invokespecial A/<init>()V
		
		dup
		astore 1
		pop
		aload 1
		
		new Fptr
		dup
		aload 0
		
		ldc "foo"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		
		dup_x1
		putfield A/a LFptr;
		pop
		aload 1
		
		getfield A/a LFptr;
		
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 2
		aload 2
		ldc 7
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
		 
.method public bar(Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		return
.end method
		 
.method public foo(Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		new Fptr
		dup
		aload 0
		
		ldc "bar"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 2
		aload 2
		aload 1
		
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
		 
