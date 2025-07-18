package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aav implements acm {
    private final /* synthetic */ int a;
    private final Object b;

    public aav(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.acm
    public final int a() {
        return this.a != 0 ? Math.max(0, ((aan) this.b).b()) : ((abw) this.b).b();
    }

    @Override // defpackage.acm
    public final int b() {
        return this.a != 0 ? ((aan) this.b).f().l : ((abw) this.b).f().l;
    }

    @Override // defpackage.acm
    public final int c() {
        return this.a != 0 ? Math.min(b() - 1, ((aaj) yfm.W(((aan) this.b).f().i)).a) : ((abk) yfm.W(((abw) this.b).f().i)).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.acm
    public final int d() {
        int i;
        long j;
        long j2 = 4294967295L;
        int i2 = 0;
        if (this.a != 0) {
            aan aanVar = (aan) this.b;
            if (aanVar.f().i.isEmpty()) {
                return 0;
            }
            aai aaiVarF = aanVar.f();
            int iC = (int) (aaiVarF.m == uv.a ? 4294967295L & aaiVarF.c() : aaiVarF.c() >> 32);
            aai aaiVarF2 = aanVar.f();
            List list = aaiVarF2.i;
            int size = list.size();
            int i3 = 0;
            while (i2 < size) {
                i3 += ((aaj) list.get(i2)).g;
                i2++;
            }
            int size2 = (i3 / list.size()) + aaiVarF2.o;
            if (size2 == 0) {
                return 1;
            }
            return ykn.j(iC / size2, 1);
        }
        abw abwVar = (abw) this.b;
        if (abwVar.f().i.isEmpty()) {
            return 0;
        }
        abj abjVarF = abwVar.f();
        uv uvVar = abjVarF.m;
        uv uvVar2 = uv.a;
        int iC2 = (int) (uvVar == uvVar2 ? abjVarF.c() & 4294967295L : abjVarF.c() >> 32);
        abj abjVarF2 = abwVar.f();
        uv uvVar3 = abjVarF2.m;
        List list2 = abjVarF2.i;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < list2.size()) {
            boolean z = uvVar3 == uvVar2 ? 1 : i2;
            int i7 = d.i(z, abjVarF2, i4);
            long j3 = j2;
            if (i7 == -1) {
                i4++;
                j2 = j3;
            } else {
                int iMax = i2;
                while (i4 < list2.size() && d.i(z, abjVarF2, i4) == i7) {
                    if (z != 0) {
                        i = iC2;
                        j = ((abk) list2.get(i4)).j & j3;
                    } else {
                        i = iC2;
                        j = ((abk) list2.get(i4)).j >> 32;
                    }
                    iMax = Math.max(iMax, (int) j);
                    i4++;
                    iC2 = i;
                }
                i5 += iMax;
                i6++;
                j2 = j3;
                iC2 = iC2;
                i2 = 0;
            }
        }
        int i8 = iC2;
        int i9 = (i5 / i6) + abjVarF2.o;
        if (i9 == 0) {
            return 1;
        }
        return ykn.j(i8 / i9, 1);
    }

    @Override // defpackage.acm
    public final boolean e() {
        return this.a != 0 ? !((aan) this.b).f().i.isEmpty() : !((abw) this.b).f().i.isEmpty();
    }
}
