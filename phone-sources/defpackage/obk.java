package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obk {
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public obk(int i, heo heoVar, hek hekVar, boolean z) {
        this.a = i;
        this.c = heoVar;
        this.d = hekVar;
        this.b = z;
    }

    public obk(int i, boolean z, byte[] bArr, byte[] bArr2) {
        this.a = i;
        this.b = z;
        this.d = bArr;
        this.c = bArr2;
    }

    public obk(Drawable drawable, boolean z, int i, String str) {
        this.c = drawable;
        this.b = z;
        this.a = i;
        this.d = str;
    }

    public obk(dhq dhqVar, dhq dhqVar2, int i) {
        this.d = dhqVar;
        this.c = dhqVar2;
        this.a = i;
        this.b = dhqVar == dhqVar2;
    }

    public obk(String str, boolean z) {
        this.d = "com.google.android.gms";
        this.c = str;
        this.a = 4225;
        this.b = z;
    }

    public obk(Parcel parcel) {
        int i = parcel.readInt();
        long[] jArr = new long[i];
        this.d = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        creator.getClass();
        RemoteViews[] remoteViewsArr = new RemoteViews[i];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i2 = 0; i2 < i; i2++) {
            if (remoteViewsArr[i2] == null) {
                throw new IllegalArgumentException(a.cj(remoteViewsArr, "null element found in ", "."));
            }
        }
        this.c = remoteViewsArr;
        this.b = parcel.readInt() == 1;
        this.a = parcel.readInt();
    }

    public obk(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.d = jArr;
        this.c = remoteViewsArr;
        this.b = false;
        this.a = 1;
        int size = yfm.ab(new ArrayList(0)).size();
        if (size > 1) {
            throw new IllegalArgumentException(a.cd(size, "View type count is set to 1, but the collection contains ", " different layout ids"));
        }
    }
}
