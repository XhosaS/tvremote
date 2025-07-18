package defpackage;

import com.google.common.collect.Lists;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abup extends abuo {
    public final Optional b;
    private final String c = "app_for_tv_android";
    private final yyk d;
    private final Optional e;

    public abup(yyk yykVar, Optional optional, Optional optional2) {
        if (yykVar == null) {
            throw new NullPointerException("Null clearcutLogSources");
        }
        this.d = yykVar;
        this.b = optional;
        this.e = optional2;
    }

    @Override // defpackage.abuo
    public final yyk a() {
        return this.d;
    }

    @Override // defpackage.abuo
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.abuo
    public final Optional c() {
        return this.e;
    }

    @Override // defpackage.abuo, defpackage.abuq
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abuo) {
            abuo abuoVar = (abuo) obj;
            if (this.c.equals(abuoVar.d())) {
                abuoVar.e();
                if (Lists.d(this.d, abuoVar.a()) && this.b.equals(abuoVar.b()) && this.e.equals(abuoVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ 1) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    @Override // defpackage.abuo
    public final void e() {
    }
}
