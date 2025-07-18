package defpackage;

import java.io.File;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qjg {
    public final String a;
    public final File b;
    public final String c;
    public final qjr d;
    final boolean f;
    final boolean g;
    public final plr k;
    public final ugx l;
    private qjf n;
    public final zas e = new yvs();
    int h = 0;
    private boolean m = false;
    public qje i = null;
    public int j = -1;

    public qjg(qjr qjrVar, String str, File file, String str2, plr plrVar, ugx ugxVar) {
        this.n = qjf.WIFI_ONLY;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.k = plrVar;
        this.d = qjrVar;
        this.l = ugxVar;
        int i = qjc.a;
        boolean zStartsWith = str.startsWith("data:");
        this.f = zStartsWith;
        boolean zStartsWith2 = str.startsWith("file:");
        this.g = zStartsWith2;
        if (zStartsWith2 || zStartsWith) {
            this.n = qjf.NONE;
        }
    }

    public final synchronized qjf a() {
        return this.n;
    }

    final synchronized void b() {
    }

    final synchronized void c() {
    }

    final synchronized void d() {
        this.m = true;
    }

    public final synchronized boolean e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qjg)) {
            return false;
        }
        qjg qjgVar = (qjg) obj;
        return yqs.a(this.a, qjgVar.a) && yqs.a(this.b, qjgVar.b) && yqs.a(this.c, qjgVar.c) && yqs.a(this.n, qjgVar.n) && this.m == qjgVar.m;
    }

    public final void f(qjf qjfVar) {
        if (this.g || this.f) {
            return;
        }
        this.n = qjfVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.n, Boolean.valueOf(this.m)});
    }

    public final String toString() {
        yqq yqqVarA = yqr.a(qjg.class);
        yqqVarA.b("", this.a);
        yqqVarA.b("targetDirectory", this.b);
        yqqVarA.b("fileName", this.c);
        yqqVarA.b("requiredConnectivity", this.n);
        yqqVarA.c("canceled", String.valueOf(this.m));
        return yqqVarA.toString();
    }
}
