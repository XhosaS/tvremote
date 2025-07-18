package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsg extends qsj {
    public final yrp a;
    private final yrp b;

    public qsg(final long j) {
        if (j <= -100 || j >= 100) {
            this.a = yru.a(new yrp() { // from class: qse
                @Override // defpackage.yrp
                public final Object eV() {
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
            this.b = yru.a(new yrp() { // from class: qsf
                @Override // defpackage.yrp
                public final Object eV() {
                    return Long.valueOf(Double.valueOf((String) this.a.a.eV()).longValue());
                }
            });
        } else {
            this.b = yru.a(new yrp() { // from class: qsc
                @Override // defpackage.yrp
                public final Object eV() {
                    return Long.valueOf(j);
                }
            });
            this.a = yru.a(new yrp() { // from class: qsd
                @Override // defpackage.yrp
                public final Object eV() {
                    return String.valueOf(j);
                }
            });
        }
    }

    @Override // defpackage.qsj
    public final /* bridge */ /* synthetic */ Object a() {
        return (Long) this.b.eV();
    }

    @Override // defpackage.qsj
    public final String b() {
        return (String) this.a.eV();
    }
}
