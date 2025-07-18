package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezs {
    public final abuy a;
    public final xcj b;

    public ezs(abuy abuyVar, xcj xcjVar) {
        this.a = abuyVar;
        this.b = xcjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezs)) {
            return false;
        }
        ezs ezsVar = (ezs) obj;
        return agvy.c(this.a, ezsVar.a) && agvy.c(this.b, ezsVar.b);
    }

    public final int hashCode() {
        int iB;
        abuy abuyVar = this.a;
        int iB2 = 0;
        if (abuyVar == null) {
            iB = 0;
        } else if ((abuyVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(abuyVar.getClass()).b(abuyVar);
        } else {
            int iB3 = abuyVar.memoizedHashCode;
            if (iB3 == 0) {
                iB3 = abza.a.a(abuyVar.getClass()).b(abuyVar);
                abuyVar.memoizedHashCode = iB3;
            }
            iB = iB3;
        }
        xcj xcjVar = this.b;
        if (xcjVar != null) {
            if ((xcjVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
                iB2 = abza.a.a(xcjVar.getClass()).b(xcjVar);
            } else {
                iB2 = xcjVar.memoizedHashCode;
                if (iB2 == 0) {
                    iB2 = abza.a.a(xcjVar.getClass()).b(xcjVar);
                    xcjVar.memoizedHashCode = iB2;
                }
            }
        }
        return (iB * 31) + iB2;
    }

    public final String toString() {
        return "LauncherContentProviderData(launcherConfigInfo=" + this.a + ", launcherCapabilities=" + this.b + ")";
    }

    public ezs() {
        this(null, null);
    }
}
