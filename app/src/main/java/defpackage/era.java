package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class era implements Iterable, eqw {
    public final String a;

    public era(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0242  */
    @Override // defpackage.eqw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqw cK(java.lang.String r27, defpackage.epp r28, java.util.List r29) {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.era.cK(java.lang.String, epp, java.util.List):eqw");
    }

    @Override // defpackage.eqw
    public final eqw d() {
        return new era(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof era) {
            return this.a.equals(((era) obj).a);
        }
        return false;
    }

    @Override // defpackage.eqw
    public final Boolean g() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.eqw
    public final Double h() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.eqw
    public final String i() {
        return this.a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new eqz(this);
    }

    @Override // defpackage.eqw
    public final Iterator l() {
        return new eqy(this);
    }

    public final String toString() {
        return "\"" + this.a + "\"";
    }
}
