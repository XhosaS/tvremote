package defpackage;

import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgn extends fgi {
    public final String a;
    public final ImmutableList b;

    /* JADX WARN: Multi-variable type inference failed */
    public fgn(String str, String str2, List list) {
        super(str);
        a.H(!list.isEmpty());
        this.a = str2;
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) list);
        this.b = immutableListCopyOf;
    }

    private static List d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0171 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x01ec, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x01ec, blocks: (B:69:0x0119, B:82:0x0168, B:84:0x0171, B:86:0x017d, B:102:0x01c7), top: B:113:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    @Override // defpackage.fgi, defpackage.eac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.eaa r7) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgn.b(eaa):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgn fgnVar = (fgn) obj;
            if (Objects.equals(this.f, fgnVar.f) && Objects.equals(this.a, fgnVar.a) && this.b.equals(fgnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() + 527;
        String str = this.a;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    @Override // defpackage.fgi
    public final String toString() {
        return this.f + ": description=" + this.a + ": values=" + String.valueOf(this.b);
    }
}
