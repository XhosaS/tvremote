package defpackage;

import android.location.Geocoder$GeocodeListener;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gze implements Geocoder$GeocodeListener {
    private final xo a;

    public gze(xo xoVar) {
        this.a = xoVar;
    }

    public final void onError(String str) {
        this.a.d(new IOException(str));
    }

    public final void onGeocode(List list) {
        list.getClass();
        this.a.b(list);
    }
}
