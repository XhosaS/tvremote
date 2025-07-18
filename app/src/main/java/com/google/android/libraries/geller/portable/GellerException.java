package com.google.android.libraries.geller.portable;

import defpackage.abqb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GellerException extends Exception {
    public final abqb a;

    public GellerException(int i, String str) {
        this(abqb.b(i), str);
    }

    public GellerException(abqb abqbVar, String str) {
        super(String.format("Code: %s, Message: %s", abqbVar.name(), str));
        this.a = abqbVar;
    }

    public GellerException(abqb abqbVar, String str, Throwable th) {
        super(String.format("Code: %s, Message: %s", abqbVar.name(), str), th);
        this.a = abqbVar;
    }
}
