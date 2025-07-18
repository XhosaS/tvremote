package defpackage;

import com.google.common.collect.Lists;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsi extends tuu {
    public final String a;
    public final String b;
    public final boolean c;
    public final twc d;
    public final boolean e;
    public final yyk f;
    public final int g;
    private final int h;
    private final boolean i;

    public tsi(int i, String str, String str2, int i2, boolean z, boolean z2, twc twcVar, boolean z3, yyk yykVar) {
        this.h = i;
        this.a = str;
        this.b = str2;
        this.g = i2;
        this.c = z;
        this.i = z2;
        this.d = twcVar;
        this.e = z3;
        this.f = yykVar;
    }

    @Override // defpackage.tuu
    public final int a() {
        return this.h;
    }

    @Override // defpackage.tuu
    public final twc b() {
        return this.d;
    }

    @Override // defpackage.tuu
    public final yyk c() {
        return this.f;
    }

    @Override // defpackage.tuu
    public final String d() {
        return this.a;
    }

    @Override // defpackage.tuu
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tuu) {
            tuu tuuVar = (tuu) obj;
            if (this.h == tuuVar.a() && this.a.equals(tuuVar.d()) && this.b.equals(tuuVar.e()) && this.g == tuuVar.i() && this.c == tuuVar.f() && this.i == tuuVar.g()) {
                tuuVar.j();
                if (this.d.equals(tuuVar.b()) && this.e == tuuVar.h() && Lists.d(this.f, tuuVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.tuu
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.tuu
    public final boolean g() {
        return this.i;
    }

    @Override // defpackage.tuu
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.h ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.g) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ this.d.hashCode();
        yyk yykVar = this.f;
        return (((iHashCode * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ yykVar.hashCode();
    }

    @Override // defpackage.tuu
    public final int i() {
        return this.g;
    }

    public final String toString() {
        int i = this.g;
        yyk yykVar = this.f;
        int i2 = this.d.f;
        return "RecognitionStartConfig{callingUid=" + this.h + ", callingPackageName=" + this.a + ", locale=" + this.b + ", recognizerMode=" + Integer.toString(i - 1) + ", isExternalAudioSource=" + this.c + ", isSmartDictation=" + this.i + ", enableIncognitoMode=false, clientType=" + Integer.toString(i2) + ", preferOffline=" + this.e + ", prebuiltBiasingExperimentIds=" + yykVar.toString() + "}";
    }

    @Override // defpackage.tuu
    public final void j() {
    }
}
