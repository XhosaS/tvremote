package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cez {
    public final int a;

    public /* synthetic */ cez(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cez) && this.a == ((cez) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a.r(i, 0) ? "Button" : a.r(i, 1) ? "Checkbox" : a.r(i, 2) ? "Switch" : a.r(i, 3) ? "RadioButton" : a.r(i, 4) ? "Tab" : a.r(i, 5) ? "Image" : a.r(i, 6) ? "DropdownList" : a.r(i, 7) ? "Picker" : a.r(i, 8) ? "Carousel" : "Unknown";
    }
}
