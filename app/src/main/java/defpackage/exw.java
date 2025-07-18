package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exw implements exu, exl {
    private final ext a;
    private final exz b;
    private final eyy c;

    public exw(ext extVar, exz exzVar, eyy eyyVar) {
        exzVar.getClass();
        eyyVar.getClass();
        this.a = extVar;
        this.b = exzVar;
        this.c = eyyVar;
    }

    @Override // defpackage.exl
    public final void a(Intent intent, exm exmVar) {
        intent.getClass();
        this.a.a(intent, exmVar, this);
    }

    @Override // defpackage.exl
    public final void b(Intent intent, exj exjVar, exk exkVar, int i, exm exmVar) {
        intent.getClass();
        exjVar.getClass();
        exkVar.getClass();
        this.a.b(intent, exmVar, this, exjVar, exkVar, i);
    }

    @Override // defpackage.exl
    public final boolean c(Intent intent, exj exjVar, exk exkVar, int i) {
        exjVar.getClass();
        exkVar.getClass();
        return this.a.b(intent, null, this, exjVar, exkVar, i);
    }

    @Override // defpackage.exu
    public final void d(exj exjVar, exk exkVar) {
        exjVar.getClass();
        exkVar.getClass();
        int iOrdinal = exjVar.ordinal();
        if (iOrdinal == 0) {
            this.c.c();
        } else if (iOrdinal == 1) {
            this.c.b();
        } else if (iOrdinal != 2) {
            throw new agpg();
        }
        int iOrdinal2 = exkVar.ordinal();
        if (iOrdinal2 == 0) {
            this.b.a();
        } else if (iOrdinal2 != 1) {
            throw new agpg();
        }
    }

    @Override // defpackage.exu
    public final void e() {
    }
}
