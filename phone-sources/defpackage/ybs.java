package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybs {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final ykn[] b;

    static {
        new ybs(new ykn[0]);
    }

    public ybs(ykn[] yknVarArr) {
        this.b = yknVarArr;
    }

    public static /* synthetic */ void c(ybs ybsVar) {
        int i = 0;
        while (true) {
            ykn[] yknVarArr = ybsVar.b;
            if (i >= yknVarArr.length) {
                return;
            }
            ykn yknVar = yknVarArr[i];
            i++;
        }
    }

    public static ybs d(xqe[] xqeVarArr, xpv xpvVar) {
        ybs ybsVar = new ybs(xqeVarArr);
        for (xqe xqeVar : xqeVarArr) {
            xqeVar.d(xpvVar);
        }
        return ybsVar;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ykn[] yknVarArr = this.b;
            if (i >= yknVarArr.length) {
                return;
            }
            i++;
        }
    }

    public final void b(long j) {
        int i = 0;
        while (true) {
            ykn[] yknVarArr = this.b;
            if (i >= yknVarArr.length) {
                return;
            }
            yknVarArr[i].b(j);
            i++;
        }
    }
}
