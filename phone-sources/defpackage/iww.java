package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iww {
    public final List a;
    public final int b;

    public iww(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iww)) {
            return false;
        }
        iww iwwVar = (iww) obj;
        return yks.e(this.a, iwwVar.a) && this.b == iwwVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "DownloadSettingOptions(optionGroups=" + this.a + ", shownFlags=" + this.b + ")";
    }
}
