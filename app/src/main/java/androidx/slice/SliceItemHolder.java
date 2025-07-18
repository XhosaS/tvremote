package androidx.slice;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import defpackage.afg;
import defpackage.bra;
import defpackage.bwy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SliceItemHolder implements bwy {
    public bwy a;
    Parcelable b;
    String c;
    int d;
    long e;
    Bundle f;
    public bra g;

    public SliceItemHolder(bra braVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = 0L;
        this.f = null;
        this.g = braVar;
    }

    public SliceItemHolder(String str, Object obj) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = 0L;
        this.f = null;
        switch (str.hashCode()) {
            case -1422950858:
                if (str.equals("action")) {
                    afg afgVar = (afg) obj;
                    Object obj2 = afgVar.a;
                    if (!(obj2 instanceof PendingIntent)) {
                        throw new IllegalArgumentException("Cannot write callback to parcel");
                    }
                    this.b = (Parcelable) obj2;
                    this.a = (bwy) afgVar.b;
                    return;
                }
                return;
            case -1377881982:
                if (str.equals("bundle")) {
                    this.f = (Bundle) obj;
                    return;
                }
                return;
            case 104431:
                if (str.equals("int")) {
                    this.d = ((Integer) obj).intValue();
                    return;
                }
                return;
            case 3327612:
                if (str.equals("long")) {
                    this.e = ((Long) obj).longValue();
                    return;
                }
                return;
            case 3556653:
                if (str.equals("text")) {
                    this.c = obj instanceof Spanned ? Html.toHtml((Spanned) obj, 0) : (String) obj;
                    return;
                }
                return;
            case 100313435:
                if (!str.equals("image")) {
                    return;
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    this.b = (Parcelable) obj;
                    return;
                }
                return;
            case 109526418:
                if (!str.equals("slice")) {
                    return;
                }
                break;
            default:
                return;
        }
        this.a = (bwy) obj;
    }
}
