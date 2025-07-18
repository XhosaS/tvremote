package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exv implements exu, exl {
    private final ext a;
    private final lzb b;
    private final eyx c;
    private final exz d;

    public exv(ext extVar, eyx eyxVar, exz exzVar, lzb lzbVar) {
        eyxVar.getClass();
        exzVar.getClass();
        lzbVar.getClass();
        this.a = extVar;
        this.c = eyxVar;
        this.d = exzVar;
        this.b = lzbVar;
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
        this.c.a();
        int iOrdinal = exjVar.ordinal();
        if (iOrdinal == 0) {
            lzb lzbVar = this.b;
            Message messageObtain = Message.obtain((Handler) null, 15);
            Bundle bundle = new Bundle();
            bundle.putBoolean("finish_on_talking_done", true);
            messageObtain.setData(bundle);
            lzbVar.j(messageObtain);
        } else if (iOrdinal == 1) {
            this.b.v();
        } else if (iOrdinal != 2) {
            throw new agpg();
        }
        int iOrdinal2 = exkVar.ordinal();
        if (iOrdinal2 == 0) {
            this.d.a();
        } else if (iOrdinal2 != 1) {
            throw new agpg();
        }
    }

    @Override // defpackage.exu
    public final void e() {
        this.c.a();
    }
}
