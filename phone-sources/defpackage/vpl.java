package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpl implements vpm {
    private final vro a;

    public vpl() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpl)) {
            return false;
        }
        vro vroVar = ((vpl) obj).a;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return a.cj(null, "ButtonStyleText(outlineColor=", ")");
    }

    public /* synthetic */ vpl(byte[] bArr) {
        this.a = null;
    }
}
