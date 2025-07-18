package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elf {
    public final String a;
    public int b;
    public long c;
    public evz d;
    public boolean e;
    public boolean f;
    final /* synthetic */ elg g;

    public elf(elg elgVar, String str, int i, evz evzVar) {
        this.g = elgVar;
        this.a = str;
        this.b = i;
        this.c = evzVar == null ? -1L : evzVar.d;
        if (evzVar == null || !evzVar.b()) {
            return;
        }
        this.d = evzVar;
    }

    public final void a(int i, evz evzVar) {
        if (this.c == -1 && i == this.b && evzVar != null) {
            elg elgVar = this.g;
            long j = evzVar.d;
            if (j >= elgVar.a()) {
                this.c = j;
            }
        }
    }

    public final boolean b(int i, evz evzVar) {
        if (evzVar == null) {
            return i == this.b;
        }
        evz evzVar2 = this.d;
        return evzVar2 == null ? !evzVar.b() && evzVar.d == this.c : evzVar.d == evzVar2.d && evzVar.b == evzVar2.b && evzVar.c == evzVar2.c;
    }

    public final boolean c(ekl eklVar) {
        evz evzVar = eklVar.d;
        if (evzVar == null) {
            return this.b != eklVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        long j2 = evzVar.d;
        if (j2 > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        eay eayVar = eklVar.b;
        int iA = eayVar.a(evzVar.a);
        int iA2 = eayVar.a(this.d.a);
        evz evzVar2 = this.d;
        if (j2 < evzVar2.d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        if (!evzVar.b()) {
            int i = evzVar.e;
            return i == -1 || i > evzVar2.b;
        }
        int i2 = evzVar.b;
        int i3 = evzVar.c;
        int i4 = evzVar2.b;
        if (i2 <= i4) {
            return i2 == i4 && i3 > evzVar2.c;
        }
        return true;
    }
}
