package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.videos.R;
import java.text.NumberFormat;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtv implements idf {
    final idf a;
    private final Context b;
    private final idf c;
    private final idf d;
    private final ieh e;
    private final idf f;
    private final NumberFormat g;
    private final int h;
    private final int i;

    public mtv(Context context, idf idfVar, idf idfVar2, idf idfVar3, ieh iehVar, idf idfVar4) {
        this.b = context;
        this.c = idfVar;
        this.d = idfVar2;
        this.a = idfVar3;
        this.e = iehVar;
        this.f = idfVar4;
        Resources resources = context.getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.details_movies_bundle_item_poster_width);
        this.i = resources.getDimensionPixelSize(R.dimen.details_movies_bundle_item_poster_height);
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        this.g = numberInstance;
        numberInstance.setMinimumFractionDigits(1);
        numberInstance.setMaximumFractionDigits(1);
    }

    /* JADX WARN: Type inference failed for: r2v20, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, lio] */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        ksy ksyVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        idy idyVar;
        String str7;
        Uri uri;
        ieg iegVar;
        ieg iegVar2;
        kvf kvfVar = (kvf) obj;
        ksy ksyVarO = kvfVar.o();
        String strE = kvfVar.E();
        Uri uriG = kvfVar.g();
        mtt mttVar = new mtt();
        mttVar.a = ksyVarO;
        mttVar.c = strE;
        mttVar.q = uriG;
        mttVar.r = this.h;
        short s = mttVar.x;
        mttVar.s = this.i;
        mttVar.x = (short) (s | 384);
        mttVar.t = ksy.w(ksyVarO);
        mttVar.x = (short) (mttVar.x | 1024);
        mttVar.b(-1);
        mttVar.f = "";
        mttVar.g = "";
        mttVar.x = (short) (mttVar.x | 2);
        mttVar.d = "";
        mttVar.e = "";
        mttVar.d(false);
        mttVar.f(0);
        mttVar.g(0);
        mttVar.e("");
        mttVar.x = (short) (mttVar.x | 32);
        mttVar.a(false);
        mttVar.m = new mmg(3);
        mttVar.c("");
        mttVar.x = (short) (mttVar.x | 512);
        ieg iegVar3 = ieg.a;
        mttVar.h(iegVar3);
        if (iegVar3 == null) {
            throw new NullPointerException("Null annotationData");
        }
        mttVar.v = iegVar3;
        mttVar.w = iegVar3;
        mttVar.b(((Integer) this.e.a()).intValue());
        mttVar.a(((Boolean) this.d.b(kvfVar)).booleanValue());
        mttVar.m = this.a.b(kvfVar);
        idf idfVar = this.f;
        mttVar.h(ieg.f(idfVar.b(kvfVar)));
        Context context = this.b;
        mttVar.c(context.getString(R.string.content_description_direct_play, kvfVar.E()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (kvfVar.d() > 0) {
            String strF = ksi.f(kvfVar.d());
            arrayList.add(strF);
            arrayList2.add(context.getString(R.string.accessibility_movie_year, strF));
        }
        if (kvfVar.c() > 0) {
            Integer numValueOf = Integer.valueOf(kvfVar.c() / 60);
            arrayList.add(context.getString(R.string.movie_duration, numValueOf));
            arrayList2.add(context.getString(R.string.accessibility_movie_duration, numValueOf));
        }
        Resources resources = context.getResources();
        String strF2 = jwq.F(resources, true, arrayList);
        if (strF2 != null) {
            mttVar.f = strF2;
        }
        String strF3 = jwq.F(resources, true, arrayList2);
        if (strF3 != null) {
            mttVar.g = strF3;
        }
        if (kvfVar.W()) {
            mttVar.e(this.g.format(kvfVar.b()));
        }
        if (kvfVar.X()) {
            mttVar.d(true);
            mttVar.f(kvfVar.S());
            int iOrdinal = kvfVar.p().ordinal();
            mttVar.g(iOrdinal != 2 ? iOrdinal != 3 ? R.drawable.ic_rotten : R.drawable.ic_certified_fresh : R.drawable.ic_fresh);
        }
        ?? B = idfVar.b(kvfVar);
        mttVar.h(ieg.f(B));
        ieg iegVar4 = (ieg) this.c.b(kvfVar);
        if (iegVar4.m()) {
            mit mitVar = new mit(kvfVar, (kxg) iegVar4.g(), B);
            mttVar.n = mitVar;
            mttVar.o = new lif(mitVar.b, (lio) B);
        }
        if (mttVar.x == 2047 && (ksyVar = mttVar.a) != null && (str = mttVar.c) != null && (str2 = mttVar.d) != null && (str3 = mttVar.e) != null && (str4 = mttVar.f) != null && (str5 = mttVar.g) != null && (str6 = mttVar.k) != null && (idyVar = mttVar.m) != null && (str7 = mttVar.p) != null && (uri = mttVar.q) != null && (iegVar = mttVar.u) != null && (iegVar2 = mttVar.v) != null) {
            ieg iegVar5 = mttVar.w;
            if (iegVar5 != null) {
                return new mtu(ksyVar, mttVar.b, str, str2, str3, str4, str5, mttVar.h, mttVar.i, mttVar.j, str6, mttVar.l, idyVar, mttVar.n, mttVar.o, str7, uri, mttVar.r, mttVar.s, mttVar.t, iegVar, iegVar2, iegVar5);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (mttVar.a == null) {
            sb.append(" assetId");
        }
        if ((mttVar.x & 1) == 0) {
            sb.append(" cardWidth");
        }
        if (mttVar.c == null) {
            sb.append(" title");
        }
        if ((mttVar.x & 2) == 0) {
            sb.append(" hasContentRating");
        }
        if (mttVar.d == null) {
            sb.append(" contentRating");
        }
        if (mttVar.e == null) {
            sb.append(" contentRatingContentDescription");
        }
        if (mttVar.f == null) {
            sb.append(" subtitle");
        }
        if (mttVar.g == null) {
            sb.append(" subtitleContentDescription");
        }
        if ((mttVar.x & 4) == 0) {
            sb.append(" hasTomatoRating");
        }
        if ((mttVar.x & 8) == 0) {
            sb.append(" tomatoRating");
        }
        if ((mttVar.x & 16) == 0) {
            sb.append(" tomatometerRatingDrawableRes");
        }
        if (mttVar.k == null) {
            sb.append(" starRating");
        }
        if ((mttVar.x & 32) == 0) {
            sb.append(" has4kBadge");
        }
        if ((mttVar.x & 64) == 0) {
            sb.append(" canDownloadContent");
        }
        if (mttVar.m == null) {
            sb.append(" downloadOnBindListener");
        }
        if (mttVar.p == null) {
            sb.append(" directPlayButtonContentDescription");
        }
        if (mttVar.q == null) {
            sb.append(" posterUrl");
        }
        if ((mttVar.x & 128) == 0) {
            sb.append(" posterWidth");
        }
        if ((mttVar.x & 256) == 0) {
            sb.append(" posterHeight");
        }
        if ((mttVar.x & 512) == 0) {
            sb.append(" isOwned");
        }
        if ((mttVar.x & 1024) == 0) {
            sb.append(" isBundle");
        }
        if (mttVar.u == null) {
            sb.append(" uiElementNodeResult");
        }
        if (mttVar.v == null) {
            sb.append(" annotationData");
        }
        if (mttVar.w == null) {
            sb.append(" detailsPageSelection");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
