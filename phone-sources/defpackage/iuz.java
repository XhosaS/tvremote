package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iuz implements sch {
    private final Long a;
    private final Long b;
    private final ith c;
    private final jaf d;
    private final /* synthetic */ int e;

    public iuz(Long l, Long l2, ith ithVar, jaf jafVar, int i) {
        this.e = i;
        this.a = l;
        this.b = l2;
        this.c = ithVar;
        this.d = jafVar;
    }

    @Override // defpackage.sch
    public final void a(Object obj, View view) {
        Long l;
        if (this.e != 0) {
            this.d.c(view);
            Long l2 = this.a;
            if (l2 == null || (l = this.b) == null) {
                return;
            }
            long jMin = Math.min(l.longValue(), l2.longValue() + 30000);
            ith ithVar = this.c;
            if (ithVar != null) {
                ithVar.g(jMin);
                return;
            }
            return;
        }
        this.d.c(view);
        Long l3 = this.a;
        if (l3 == null || this.b == null) {
            return;
        }
        long jLongValue = l3.longValue() - 30000;
        ith ithVar2 = this.c;
        long jMax = Math.max(0L, jLongValue);
        if (ithVar2 != null) {
            ithVar2.g(jMax);
        }
    }
}
