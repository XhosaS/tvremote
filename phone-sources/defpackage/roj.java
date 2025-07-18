package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class roj extends rol {
    public final ttm a;
    private final ttm b;

    public roj(final long j) {
        if (j <= -100 || j >= 100) {
            final int i = 2;
            this.a = sij.l(new ttm() { // from class: roi
                @Override // defpackage.ttm
                public final Object get() {
                    int i2 = i;
                    if (i2 == 0) {
                        return String.valueOf(j);
                    }
                    if (i2 == 1) {
                        return Long.valueOf(j);
                    }
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
            this.b = sij.l(new riu(this, 13));
        } else {
            final int i2 = 1;
            this.b = sij.l(new ttm() { // from class: roi
                @Override // defpackage.ttm
                public final Object get() {
                    int i22 = i2;
                    if (i22 == 0) {
                        return String.valueOf(j);
                    }
                    if (i22 == 1) {
                        return Long.valueOf(j);
                    }
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
            final int i3 = 0;
            this.a = sij.l(new ttm() { // from class: roi
                @Override // defpackage.ttm
                public final Object get() {
                    int i22 = i3;
                    if (i22 == 0) {
                        return String.valueOf(j);
                    }
                    if (i22 == 1) {
                        return Long.valueOf(j);
                    }
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
        }
    }

    @Override // defpackage.rol
    public final /* bridge */ /* synthetic */ Object a() {
        return (Long) this.b.get();
    }

    @Override // defpackage.rol
    public final String b() {
        return (String) this.a.get();
    }
}
