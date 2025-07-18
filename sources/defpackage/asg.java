package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asg extends ash {
    public final byo a;
    private final byo b;

    public asg(final long j) {
        final int i = 0;
        if (j <= -100 || j >= 100) {
            final int i2 = 2;
            this.a = bit.k(new byo() { // from class: ase
                @Override // defpackage.byo
                public final Object aL() {
                    int i3 = i2;
                    if (i3 == 0) {
                        return String.valueOf(j);
                    }
                    if (i3 == 1) {
                        return Long.valueOf(j);
                    }
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
            this.b = bit.k(new asf(this, 0));
        } else {
            final int i3 = 1;
            this.b = bit.k(new byo() { // from class: ase
                @Override // defpackage.byo
                public final Object aL() {
                    int i32 = i3;
                    if (i32 == 0) {
                        return String.valueOf(j);
                    }
                    if (i32 == 1) {
                        return Long.valueOf(j);
                    }
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
            this.a = bit.k(new byo() { // from class: ase
                @Override // defpackage.byo
                public final Object aL() {
                    int i32 = i;
                    if (i32 == 0) {
                        return String.valueOf(j);
                    }
                    if (i32 == 1) {
                        return Long.valueOf(j);
                    }
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
        }
    }

    @Override // defpackage.ash
    public final /* bridge */ /* synthetic */ Object a() {
        return (Long) this.b.aL();
    }

    @Override // defpackage.ash
    public final String b() {
        return (String) this.a.aL();
    }
}
