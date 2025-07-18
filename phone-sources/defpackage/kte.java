package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kte implements Parcelable {
    public final String a;
    public final boolean b;
    public final kzp c;
    public final kzq d;

    public kte() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kte) {
            kte kteVar = (kte) obj;
            if (this.a.equals(kteVar.a) && this.b == kteVar.b && this.c.equals(kteVar.c) && this.d.equals(kteVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        kzq kzqVar = this.d;
        return "AudioTrack{languageTag=" + this.a + ", surroundSound=" + this.b + ", languageType=" + this.c.toString() + ", trackType=" + kzqVar.toString() + "}";
    }

    public kte(String str, boolean z, kzp kzpVar, kzq kzqVar) {
        if (str == null) {
            throw new NullPointerException("Null languageTag");
        }
        this.a = str;
        this.b = z;
        if (kzpVar == null) {
            throw new NullPointerException("Null languageType");
        }
        this.c = kzpVar;
        if (kzqVar == null) {
            throw new NullPointerException("Null trackType");
        }
        this.d = kzqVar;
    }
}
