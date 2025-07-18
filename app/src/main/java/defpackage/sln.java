package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sln extends IOException {
    public final rxj a;

    public sln(rxj rxjVar) {
        this.a = rxjVar;
    }

    public sln(String str, rxj rxjVar) {
        super(str);
        this.a = rxjVar;
    }

    public sln(String str, rxj rxjVar, Throwable th) {
        super(str, th);
        this.a = rxjVar;
    }
}
