package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzf extends gbb {
    public int a;
    public int b;
    public int c;
    public int d;
    public final mdw e;
    private final gbo l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzf(gbo gboVar, yow yowVar, yot yotVar, yot yotVar2, tqr tqrVar, gbn gbnVar) {
        super(gboVar, yowVar, yotVar, new gbc(), tqrVar);
        gbnVar.getClass();
        this.l = gboVar;
        this.c = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.d = Integer.MIN_VALUE;
        gbc gbcVar = this.h;
        gbcVar.getClass();
        this.e = new mdw(yowVar, tqrVar, gboVar, yotVar, yotVar2, this, gbcVar);
        gbc gbcVar2 = this.h;
        int i = gbnVar.e;
        int i2 = i != Integer.MIN_VALUE ? i : 0;
        int i3 = gbnVar.f;
        int i4 = i3 != Integer.MIN_VALUE ? i3 : 0;
        boolean z = (i == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE) ? false : true;
        gbcVar2.b = i2;
        List list = gbcVar2.a;
        list.clear();
        list.add(gbnVar);
        gbcVar2.c = i4;
        gbcVar2.d = 0;
        List list2 = gbnVar.b;
        gbcVar2.f = list2.size();
        gbcVar2.e = z;
        gbcVar2.g = list2.size() / 2;
        h(gbcVar2.a());
        gbc gbcVar3 = this.h;
        if (gbcVar3.b <= 0) {
            int i5 = gbcVar3.c;
        }
    }

    @Override // defpackage.gbb
    public final gbo a() {
        return this.l;
    }

    @Override // defpackage.gbb
    public final void b(int i) {
        int i2 = this.k.c;
        gbc gbcVar = this.h;
        int i3 = gbcVar.b;
        int i4 = i - i3;
        int i5 = i3 + gbcVar.f;
        int iMax = Math.max(1 - i4, this.a);
        this.a = iMax;
        if (iMax > 0) {
            mdw mdwVar = this.e;
            fzv fzvVar = ((gba) mdwVar.f).a;
            if ((fzvVar instanceof fzu) && !fzvVar.c) {
                mdwVar.v();
            }
        }
        int iMax2 = Math.max((i + 2) - i5, this.b);
        this.b = iMax2;
        if (iMax2 > 0) {
            mdw mdwVar2 = this.e;
            fzv fzvVar2 = ((gba) mdwVar2.f).b;
            if ((fzvVar2 instanceof fzu) && !fzvVar2.c) {
                mdwVar2.u();
            }
        }
        this.c = Math.min(this.c, i);
        this.d = Math.max(this.d, i);
    }

    @Override // defpackage.gbb
    public final boolean c() {
        return this.e.w();
    }
}
