package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qkr implements qkb {
    final /* synthetic */ List a;
    private final /* synthetic */ int b;

    public qkr(List list, int i) {
        this.b = i;
        this.a = list;
    }

    @Override // defpackage.qkb
    public final int a(qen qenVar) {
        int i = this.b;
        if (i == 0) {
            qenVar.getClass();
            if (this.a.contains(qenVar.b())) {
                return 2;
            }
            return qenVar.f == 4 ? 4 : 5;
        }
        if (i != 1) {
            qenVar.getClass();
            if (this.a.contains(qenVar.b())) {
                return 3;
            }
            int i2 = qenVar.f;
            if (i2 == 5) {
                return 6;
            }
            return i2;
        }
        qenVar.getClass();
        if (this.a.contains(qenVar.b())) {
            return 3;
        }
        int i3 = qenVar.f;
        if (i3 == 5) {
            return 6;
        }
        return i3;
    }
}
