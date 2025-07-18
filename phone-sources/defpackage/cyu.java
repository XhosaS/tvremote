package defpackage;

import android.view.accessibility.AccessibilityRecord;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyu {
    private final AccessibilityRecord a;

    @Deprecated
    public cyu(Object obj) {
        this.a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public final int a() {
        return this.a.getItemCount();
    }

    @Deprecated
    public final void b(int i) {
        this.a.setFromIndex(i);
    }

    @Deprecated
    public final void c(int i) {
        this.a.setToIndex(i);
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyu)) {
            return false;
        }
        cyu cyuVar = (cyu) obj;
        AccessibilityRecord accessibilityRecord = this.a;
        return accessibilityRecord == null ? cyuVar.a == null : accessibilityRecord.equals(cyuVar.a);
    }

    @Deprecated
    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }
}
