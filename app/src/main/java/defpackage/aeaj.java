package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeaj {
    public final aeag a;

    public aeaj(aeag aeagVar) {
        this.a = aeagVar;
    }

    public final /* synthetic */ aeai a() {
        abxd abxdVarV = this.a.v();
        abxdVarV.getClass();
        return (aeai) abxdVarV;
    }

    public final void b(int i) {
        if (i == 0) {
            throw null;
        }
        aeag aeagVar = this.a;
        if ((aeagVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aeagVar.y();
        }
        aeai aeaiVar = (aeai) aeagVar.b;
        aeai aeaiVar2 = aeai.a;
        aeaiVar.f = i;
        aeaiVar.b |= 64;
    }
}
