package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ody {
    public Bitmap a;
    public String b;
    public String c;
    public oeh e;
    private final String g;
    private final Bundle f = new Bundle();
    public final List d = new ArrayList();

    @Deprecated
    public ody() {
        new ApplicationErrorReport();
        this.g = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
    }

    public final odz a() {
        odz odzVar = new odz(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null);
        odzVar.m = this.a;
        odzVar.f = null;
        odzVar.a = null;
        odzVar.c = this.b;
        odzVar.b = this.f;
        odzVar.e = this.c;
        odzVar.h = this.d;
        odzVar.i = false;
        odzVar.j = this.e;
        odzVar.k = null;
        odzVar.l = false;
        odzVar.n = this.g;
        odzVar.o = false;
        odzVar.p = 0L;
        odzVar.q = false;
        odzVar.r = null;
        odzVar.s = null;
        return odzVar;
    }

    @Deprecated
    public final void b(String str, String str2) {
        this.f.putString(str, str2);
    }

    public final void c(String str, String str2) {
        d();
        this.f.putString(str, str2);
    }

    public final void d() {
        if (this.f.isEmpty()) {
            this.d.isEmpty();
        }
    }
}
