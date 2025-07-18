package androidx.slice;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.bwy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Slice extends CustomVersionedParcelable implements bwy {
    static final String[] a = new String[0];
    static final SliceItem[] b = new SliceItem[0];
    public SliceSpec c;
    public SliceItem[] d;
    public String[] e;
    public String f;

    public Slice() {
        this.c = null;
        this.d = b;
        this.e = a;
        this.f = null;
    }

    public static void b(StringBuilder sb, String[] strArr) {
        int length;
        if (strArr == null || (length = strArr.length) == 0) {
            return;
        }
        sb.append('(');
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(strArr[i2]);
            sb.append(", ");
        }
        sb.append(strArr[i]);
        sb.append(")");
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Slice ");
        String[] strArr = this.e;
        if (strArr.length > 0) {
            b(sb, strArr);
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.f);
        sb.append("] {\n");
        int i = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.d;
            if (i >= sliceItemArr.length) {
                sb.append(str);
                sb.append('}');
                return sb.toString();
            }
            sb.append(sliceItemArr[i].d(str.concat("  ")));
            i++;
        }
    }

    public final String toString() {
        return a("");
    }

    public Slice(Bundle bundle) {
        this.c = null;
        this.d = b;
        this.e = a;
        this.f = null;
        this.e = bundle.getStringArray("hints");
        Parcelable[] parcelableArray = bundle.getParcelableArray("items");
        this.d = new SliceItem[parcelableArray.length];
        int i = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.d;
            if (i >= sliceItemArr.length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i];
            if (parcelable instanceof Bundle) {
                sliceItemArr[i] = new SliceItem((Bundle) parcelable);
            }
            i++;
        }
        this.f = bundle.getParcelable("uri").toString();
        this.c = bundle.containsKey("type") ? new SliceSpec(bundle.getString("type"), bundle.getInt("revision")) : null;
    }
}
