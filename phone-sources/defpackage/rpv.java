package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpv {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rpv)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 296760191;
    }

    public final String toString() {
        return "GlobalConfigurations{componentNameSupplier=null, extensionProvider=null, pauseTimersWhenSleeping=false, pauseStartupMeasuresWhenSleeping=false}";
    }
}
