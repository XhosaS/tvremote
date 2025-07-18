package defpackage;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxl {
    static final cxm[] a = new cxm[0];
    cxn b;
    cxm[] c;
    public final String[] d;
    String e;

    public cxl(ArrayList arrayList, String[] strArr, Uri uri, cxn cxnVar) {
        this.b = null;
        this.c = a;
        this.e = null;
        this.d = strArr;
        this.c = (cxm[]) arrayList.toArray(new cxm[arrayList.size()]);
        this.e = uri.toString();
        this.b = cxnVar;
    }

    public static void c(StringBuilder sb, String[] strArr) {
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

    static void d(IconCompat iconCompat) {
        if (iconCompat.b == 2 && iconCompat.a() == 0) {
            throw new IllegalArgumentException("Failed to add icon, invalid resource id: " + iconCompat.a());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArray("hints", this.d);
        Parcelable[] parcelableArr = new Parcelable[this.c.length];
        int i = 0;
        while (true) {
            cxm[] cxmVarArr = this.c;
            if (i >= cxmVarArr.length) {
                bundle.putParcelableArray("items", parcelableArr);
                bundle.putParcelable("uri", Uri.parse(this.e));
                cxn cxnVar = this.b;
                if (cxnVar != null) {
                    bundle.putString("type", cxnVar.a);
                    int i2 = this.b.b;
                    bundle.putInt("revision", 1);
                }
                return bundle;
            }
            cxm cxmVar = cxmVarArr[i];
            Bundle bundle2 = new Bundle();
            bundle2.putStringArray("hints", cxmVar.a);
            String str = cxmVar.b;
            bundle2.putString("format", str);
            bundle2.putString("subtype", cxmVar.c);
            Object obj = cxmVar.d;
            switch (str.hashCode()) {
                case -1422950858:
                    if (!str.equals("action")) {
                        break;
                    } else {
                        afg afgVar = (afg) obj;
                        Parcelable parcelable = (Parcelable) afgVar.a;
                        if (parcelable instanceof Intent) {
                            bundle2.putString("intent", ((Intent) parcelable).toUri(1));
                        } else {
                            bundle2.putParcelable("obj", parcelable);
                        }
                        bundle2.putBundle("obj_2", ((cxl) afgVar.b).a());
                        break;
                    }
                case -1377881982:
                    if (!str.equals("bundle")) {
                        break;
                    } else {
                        bundle2.putBundle("obj", (Bundle) obj);
                        break;
                    }
                case 104431:
                    if (!str.equals("int")) {
                        break;
                    } else {
                        aff.a(obj, "Object must be non-null for FORMAT_INT");
                        bundle2.putInt("obj", ((Integer) obj).intValue());
                        break;
                    }
                case 3327612:
                    if (!str.equals("long")) {
                        break;
                    } else {
                        aff.a(obj, "Object must be non-null for FORMAT_LONG");
                        bundle2.putLong("obj", ((Long) obj).longValue());
                        break;
                    }
                case 3556653:
                    if (!str.equals("text")) {
                        break;
                    } else {
                        bundle2.putCharSequence("obj", (CharSequence) obj);
                        break;
                    }
                case 100313435:
                    if (str.equals("image")) {
                        IconCompat iconCompat = (IconCompat) obj;
                        Bundle bundle3 = new Bundle();
                        switch (iconCompat.b) {
                            case -1:
                                bundle3.putParcelable("obj", (Parcelable) iconCompat.c);
                                break;
                            case 0:
                            default:
                                throw new IllegalArgumentException("Invalid icon");
                            case 1:
                            case 5:
                                bundle3.putParcelable("obj", (Bitmap) iconCompat.c);
                                break;
                            case 2:
                            case 4:
                            case 6:
                                bundle3.putString("obj", (String) iconCompat.c);
                                break;
                            case 3:
                                bundle3.putByteArray("obj", (byte[]) iconCompat.c);
                                break;
                        }
                        bundle3.putInt("type", iconCompat.b);
                        bundle3.putInt("int1", iconCompat.f);
                        bundle3.putInt("int2", iconCompat.g);
                        bundle3.putString("string1", iconCompat.k);
                        ColorStateList colorStateList = iconCompat.h;
                        if (colorStateList != null) {
                            bundle3.putParcelable("tint_list", colorStateList);
                        }
                        PorterDuff.Mode mode = iconCompat.i;
                        if (mode != IconCompat.a) {
                            bundle3.putString("tint_mode", mode.name());
                        }
                        bundle2.putBundle("obj", bundle3);
                        break;
                    } else {
                        continue;
                    }
                case 100358090:
                    if (!str.equals("input")) {
                        break;
                    } else {
                        bundle2.putParcelable("obj", (Parcelable) obj);
                        break;
                    }
                case 109526418:
                    if (!str.equals("slice")) {
                        break;
                    } else {
                        bundle2.putParcelable("obj", ((cxl) obj).a());
                        break;
                    }
            }
            parcelableArr[i] = bundle2;
            i++;
        }
    }

    public final String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Slice ");
        String[] strArr = this.d;
        if (strArr.length > 0) {
            c(sb, strArr);
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.e);
        sb.append("] {\n");
        int i = 0;
        while (true) {
            cxm[] cxmVarArr = this.c;
            if (i >= cxmVarArr.length) {
                sb.append(str);
                sb.append('}');
                return sb.toString();
            }
            sb.append(cxmVarArr[i].d(str.concat("  ")));
            i++;
        }
    }

    public final String toString() {
        return b("");
    }
}
