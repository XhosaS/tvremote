package defpackage;

import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hku extends uua implements hhl, hhn {
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/results/medialist/MediaBrowseRow");
    private final int d;
    private final String e;
    private final String f;
    private final List g;
    private boolean h;
    private String i;
    private String k;
    private final Queue l;
    private final int m;
    private final int n;
    private final int o;
    private final boolean p;
    private pan q;

    /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hku(android.content.Context r18, defpackage.xqe r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hku.<init>(android.content.Context, xqe, boolean):void");
    }

    private final void l() {
        Queue queue = this.l;
        if (queue.isEmpty()) {
            return;
        }
        xly xlyVar = (xly) queue.poll();
        List list = this.g;
        int i = this.m;
        int i2 = this.n;
        String str = this.f;
        int size = list.size();
        acjc acjcVar = xlyVar.l;
        if (acjcVar == null) {
            acjcVar = acjc.a;
        }
        hkt hktVar = new hkt(size, xlyVar, i, i2, str, acjcVar);
        if (hktVar.E()) {
            list.add(hktVar);
        } else {
            ((zdv) ((zdv) c.b()).q("com/google/android/apps/tvsearch/results/medialist/MediaBrowseRow", "addOneMoreToSearchItems", 240, "MediaBrowseRow.java")).x("Conversion failure on MediaList row. title:[%s]", this.e);
            l();
        }
    }

    @Override // defpackage.gkj
    public final int a() {
        return this.d;
    }

    @Override // defpackage.gkj
    public final /* synthetic */ pan b() {
        return null;
    }

    @Override // defpackage.gkj
    public final pan c() {
        if (this.q == null) {
            this.q = new pan(this.d);
        }
        return this.q;
    }

    @Override // defpackage.gkj
    public final String d() {
        return this.e;
    }

    @Override // defpackage.gkj
    public final String e() {
        return this.f;
    }

    @Override // defpackage.hhl
    public final int f() {
        return this.g.size();
    }

    @Override // defpackage.hhl
    public final hkk g(int i) {
        if (this.p) {
            List list = this.g;
            if (i >= list.size() - this.o) {
                l();
            }
        }
        return (hkk) this.g.get(i);
    }

    @Override // defpackage.hhl
    public final String h() {
        return this.k;
    }

    @Override // defpackage.hhl
    public final String i() {
        return this.i;
    }

    @Override // defpackage.hhl
    public final boolean j() {
        return this.h;
    }

    @Override // defpackage.hhn
    public final double k() {
        return 1.0d;
    }
}
