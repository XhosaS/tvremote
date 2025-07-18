package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slo {
    public final Uri a;
    public final vvj b;
    public final tst c;
    public final ImmutableList d;
    public final sma e;
    public final boolean f;

    public slo() {
        throw null;
    }

    public static sln a() {
        sln slnVar = new sln(null);
        slnVar.d = slx.a;
        slnVar.b();
        slnVar.e = true;
        slnVar.f = (byte) (1 | slnVar.f);
        return slnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slo) {
            slo sloVar = (slo) obj;
            if (this.a.equals(sloVar.a) && this.b.equals(sloVar.b) && this.c.equals(sloVar.c) && this.d.equals(sloVar.d) && this.e.equals(sloVar.e) && this.f == sloVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        sma smaVar = this.e;
        ImmutableList immutableList = this.d;
        tst tstVar = this.c;
        vvj vvjVar = this.b;
        return "ProtoDataStoreConfig{uri=" + String.valueOf(this.a) + ", schema=" + String.valueOf(vvjVar) + ", handler=" + String.valueOf(tstVar) + ", migrations=" + String.valueOf(immutableList) + ", variantConfig=" + String.valueOf(smaVar) + ", useGeneratedExtensionRegistry=" + this.f + ", enableTracing=false}";
    }

    public slo(Uri uri, vvj vvjVar, tst tstVar, ImmutableList immutableList, sma smaVar, boolean z) {
        this.a = uri;
        this.b = vvjVar;
        this.c = tstVar;
        this.d = immutableList;
        this.e = smaVar;
        this.f = z;
    }
}
