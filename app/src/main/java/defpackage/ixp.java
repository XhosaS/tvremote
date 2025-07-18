package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.katniss.R;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixp implements ixj {
    public static final ixk a = new ixk();
    private static final zdy h = zdy.h("com/google/android/apps/tvsearch/suggestions/starters/ConversationStartersDataManagerImpl");
    public final Context b;
    public final agte c;
    public final ixt d;
    public final ghp e;
    public final List f;
    public String g;
    private final ahbt i;
    private final AtomicReference j;
    private final AtomicReference k;
    private final Map l;

    public ixp(Context context, agte agteVar, ahbt ahbtVar, ixt ixtVar, ghp ghpVar) {
        context.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        ghpVar.getClass();
        this.b = context;
        this.c = agteVar;
        this.i = ahbtVar;
        this.d = ixtVar;
        this.e = ghpVar;
        List listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
        listSynchronizedList.getClass();
        this.f = listSynchronizedList;
        this.j = new AtomicReference(null);
        this.k = new AtomicReference(abvo.b);
        this.l = new LinkedHashMap();
        this.g = "";
    }

    @Override // defpackage.ixj
    public final zyd a() {
        return ahkr.c(this.i, 0, new ixn(this, null), 3);
    }

    @Override // defpackage.ixj
    public final abvo b() {
        return (abvo) this.j.get();
    }

    @Override // defpackage.ixj
    public final abvo c() {
        Object obj = this.k.get();
        obj.getClass();
        return (abvo) obj;
    }

    @Override // defpackage.ixj
    public final void d(String str) {
        abvo abvoVar = (abvo) this.l.get(str);
        if (abvoVar != null) {
            this.j.set(abvoVar);
        }
    }

    @Override // defpackage.ixj
    public final void e() throws Throwable {
        ahak.a(agtf.a, new ixl(this, null));
    }

    @Override // defpackage.ixj
    public final void f() {
        this.f.clear();
    }

    @Override // defpackage.ixj
    public final void g() {
        this.j.set(null);
    }

    @Override // defpackage.ixj
    public final void h(xui xuiVar) throws Throwable {
        int iA;
        int iA2;
        xuiVar.getClass();
        ArrayList arrayList = new ArrayList();
        xuc xucVar = xuiVar.b;
        if (xucVar == null) {
            xucVar = xuc.a;
        }
        xucVar.getClass();
        int i = 1;
        xqo xqoVar = xucVar.b == 1 ? (xqo) xucVar.c : xqo.a;
        xqoVar.getClass();
        Iterator<E> it = xqoVar.c.iterator();
        int i2 = 0;
        while (true) {
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            if (!it.hasNext()) {
                for (xuh xuhVar : xuiVar.c) {
                    xuf xufVar = xuhVar.b;
                    if (xufVar == null) {
                        xufVar = xuf.a;
                    }
                    String str = xufVar.b;
                    str.getClass();
                    xuc xucVar2 = xuhVar.c;
                    if (xucVar2 == null) {
                        xucVar2 = xuc.a;
                    }
                    xqo xqoVar2 = xucVar2.b == i ? (xqo) xucVar2.c : xqo.a;
                    xqoVar2.getClass();
                    Iterator<E> it2 = xqoVar2.c.iterator();
                    int i5 = 0;
                    while (it2.hasNext()) {
                        int i6 = i5 + 1;
                        String str2 = ((xqq) it2.next()).b;
                        str2.getClass();
                        xub xubVar = (xub) xucVar.d.get(i5);
                        try {
                            int i7 = xubVar.memoizedSerializedSize;
                            if ((i7 & i4) != 0) {
                                iA = abza.a.a(xubVar.getClass()).a(xubVar);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA = i7 & i3;
                                if (iA == i3) {
                                    iA = abza.a.a(xubVar.getClass()).a(xubVar);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                    xubVar.memoizedSerializedSize = (xubVar.memoizedSerializedSize & i4) | iA;
                                }
                            }
                            byte[] bArr = new byte[iA];
                            boolean z = abvz.e;
                            abvw abvwVar = new abvw(bArr, 0, iA);
                            abza.a.a(xubVar.getClass()).m(xubVar, abwa.a(abvwVar));
                            abvwVar.K();
                            String strEncodeToString = Base64.encodeToString(bArr, 0);
                            strEncodeToString.getClass();
                            arrayList.add(new ixq(str2, str, strEncodeToString));
                            i5 = i6;
                            i = 1;
                            i3 = Integer.MAX_VALUE;
                            i4 = Integer.MIN_VALUE;
                        } catch (IOException e) {
                            throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", xubVar), e);
                        }
                    }
                }
                ahak.a(agtf.a, new ixo(this, arrayList, null));
                return;
            }
            int i8 = i2 + 1;
            xqq xqqVar = (xqq) it.next();
            String str3 = xqqVar.b;
            str3.getClass();
            xub xubVar2 = (xub) xucVar.d.get(i2);
            try {
                int i9 = xubVar2.memoizedSerializedSize;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    iA2 = abza.a.a(xubVar2.getClass()).a(xubVar2);
                    if (iA2 < 0) {
                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                    }
                } else {
                    int i10 = i9 & Integer.MAX_VALUE;
                    if (i10 == Integer.MAX_VALUE) {
                        iA2 = abza.a.a(xubVar2.getClass()).a(xubVar2);
                        if (iA2 < 0) {
                            throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                        }
                        xubVar2.memoizedSerializedSize = (xubVar2.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                    } else {
                        iA2 = i10;
                    }
                }
                byte[] bArr2 = new byte[iA2];
                boolean z2 = abvz.e;
                abvw abvwVar2 = new abvw(bArr2, 0, iA2);
                abza.a.a(xubVar2.getClass()).m(xubVar2, abwa.a(abvwVar2));
                abvwVar2.K();
                String strEncodeToString2 = Base64.encodeToString(bArr2, 0);
                strEncodeToString2.getClass();
                arrayList.add(new ixq(str3, "general", strEncodeToString2));
                String str4 = xqqVar.b;
                i2 = i8;
            } catch (IOException e2) {
                throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", xubVar2), e2);
            }
        }
    }

    @Override // defpackage.ixj
    public final void i(String str) {
        if (str == null) {
            str = "";
        }
        this.g = str;
    }

    @Override // defpackage.ixj
    public final void j(xuq xuqVar) {
        xuqVar.getClass();
        Map map = this.l;
        map.clear();
        f();
        xup xupVar = xuqVar.c;
        if (xupVar == null) {
            xupVar = xup.a;
        }
        xupVar.getClass();
        xqo xqoVar = xupVar.b == 1 ? (xqo) xupVar.c : xqo.a;
        xqoVar.getClass();
        xuc xucVar = xuqVar.d;
        if (xucVar == null) {
            xucVar = xuc.a;
        }
        xucVar.getClass();
        xqo xqoVar2 = xucVar.b == 1 ? (xqo) xucVar.c : xqo.a;
        xqoVar2.getClass();
        int i = 67495;
        if (xqoVar.c.size() == xqoVar2.c.size()) {
            int size = xqoVar.c.size();
            int i2 = 0;
            while (i2 < size) {
                xqq xqqVar = (xqq) xqoVar.c.get(i2);
                if (!agvy.c(xqqVar.b, ((xqq) xqoVar2.c.get(i2)).b)) {
                    break;
                }
                String str = xqqVar.b;
                str.getClass();
                SuggestionChipItem suggestionChipItem = new SuggestionChipItem(str, null, null, i);
                if (xupVar.d.size() == xqoVar.c.size()) {
                    xuo xuoVar = (xuo) xupVar.d.get(i2);
                    xuoVar.getClass();
                    suggestionChipItem.e(xuoVar);
                }
                if (xucVar.d.size() == xqoVar2.c.size()) {
                    xub xubVar = (xub) xucVar.d.get(i2);
                    xubVar.getClass();
                    suggestionChipItem.f(xubVar);
                } else {
                    ((zdv) h.d().q("com/google/android/apps/tvsearch/suggestions/starters/ConversationStartersDataManagerImpl", "setVoicePlateSuggestions", 163, "ConversationStartersDataManagerImpl.kt")).u("Count of LoggingInfo mismatch the count of suggestions");
                }
                this.f.add(suggestionChipItem);
                xqs xqsVar = xqqVar.d;
                if (xqsVar == null) {
                    xqsVar = xqs.a;
                }
                abvo abvoVar = xqsVar.c;
                abvoVar.getClass();
                String str2 = xqqVar.b;
                str2.getClass();
                map.put(str2, abvoVar);
                i2++;
                i = 67495;
            }
        }
        if (agvy.c(xqoVar.d, xqoVar2.d)) {
            this.k.set(xqoVar.d);
        }
        List list = this.f;
        String string = this.b.getString(R.string.send_feedback);
        string.getClass();
        list.add(new SuggestionChipItem(string, null, null, 67495));
    }
}
