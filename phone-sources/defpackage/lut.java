package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lut implements idf {
    private static final idy a = new lyl("suggestion query failed", 4);
    private final iea b;
    private final idf c;
    private final idf d;
    private final idf e;
    private final int f;
    private final lys g;
    private final lrc h;
    private final kuw i;

    public lut(Context context, lys lysVar, kuw kuwVar, iea ieaVar, lge lgeVar, lrc lrcVar, lyz lyzVar, boolean z, int i, long j) throws Resources.NotFoundException {
        this.g = lysVar;
        this.i = kuwVar;
        this.b = ieaVar;
        this.h = lrcVar;
        lbj lbjVar = new lbj(context, 2);
        this.c = z ? new lup(ieaVar, lyzVar, i, context.getDrawable(2131231883), j) : new icy(Collections.EMPTY_LIST);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.play_search_suggestion_icon_size);
        this.f = dimensionPixelSize;
        idh idhVarD = idh.d();
        idhVarD.e(new leo(context, dimensionPixelSize, dimensionPixelSize));
        idf idfVarB = idhVarD.b(new jxt(lbjVar, 7));
        this.d = new luq(ieaVar, lgeVar, idfVarB, 0);
        this.e = new luq(ieaVar, lgeVar, idfVarB, 2);
    }

    private static void a(List list, List list2, HashSet hashSet) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            tha thaVar = (tha) it.next();
            String str = (String) thaVar.c;
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (Character.isLetterOrDigit(cCharAt)) {
                    sb.append(Character.toLowerCase(cCharAt));
                }
            }
            if (hashSet.add(sb.toString())) {
                list.add(thaVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        ieg iegVar;
        String str;
        String str2 = (String) obj;
        ieg iegVarA = ((ldy) this.b).a();
        if (!iegVarA.k()) {
            lys lysVar = this.g;
            if (!lysVar.g(iegVarA)) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                String lowerCase = str2 == null ? "" : str2.replaceAll("^\\s+", "").replaceAll("\\s+", " ").toLowerCase(Locale.getDefault());
                a(arrayList, (List) this.c.b(lowerCase), hashSet);
                if (TextUtils.isEmpty(lowerCase)) {
                    return ieg.f(arrayList);
                }
                ksn ksnVar = (ksn) iegVarA.g();
                lcs lcsVar = (lcs) lysVar.i.get(ksnVar.a);
                if (!lysVar.j.m() && (lcsVar == null || lcsVar.c.isEmpty())) {
                    this.i.s(ksnVar);
                }
                a(arrayList, this.d.b(lowerCase), hashSet);
                a(arrayList, this.e.b(lowerCase), hashSet);
                lrc lrcVar = this.h;
                lrm lrmVar = new lrm();
                lrmVar.c("");
                lrmVar.b(0);
                lrmVar.d = 10;
                byte b = lrmVar.f;
                lrmVar.e = 10;
                lrmVar.f = (byte) (b | 6);
                lrmVar.a(ieg.a);
                lrmVar.a(iegVarA);
                lrmVar.c(lowerCase);
                lrmVar.b(this.f);
                if (lrmVar.f == 7 && (iegVar = lrmVar.a) != null && (str = lrmVar.b) != null) {
                    ieg iegVar2 = (ieg) lrcVar.b(new lrn(iegVar, str, lrmVar.c, lrmVar.d, lrmVar.e));
                    iegVar2.n(a);
                    a(arrayList, (List) iegVar2.h(ImmutableList.of()), hashSet);
                    return ieg.f(arrayList);
                }
                StringBuilder sb = new StringBuilder();
                if (lrmVar.a == null) {
                    sb.append(" account");
                }
                if (lrmVar.b == null) {
                    sb.append(" partialQuery");
                }
                if ((lrmVar.f & 1) == 0) {
                    sb.append(" iconBlobSize");
                }
                if ((lrmVar.f & 2) == 0) {
                    sb.append(" maxAsset");
                }
                if ((lrmVar.f & 4) == 0) {
                    sb.append(" maxCollection");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }
        return ieg.a;
    }
}
