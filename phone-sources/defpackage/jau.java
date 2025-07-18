package defpackage;

import android.util.Pair;
import com.google.android.apps.play.movies.mobile.usecase.settings.ChimeNotificationSettingsActivity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jau extends yiz implements yjz {
    final /* synthetic */ List a;
    final /* synthetic */ String b;
    final /* synthetic */ ChimeNotificationSettingsActivity c;
    final /* synthetic */ kuw d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jau(List list, kuw kuwVar, String str, ChimeNotificationSettingsActivity chimeNotificationSettingsActivity, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.a = list;
        this.d = kuwVar;
        this.b = str;
        this.c = chimeNotificationSettingsActivity;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((jau) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((jau) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        return this.e != 0 ? new jau(this.a, this.d, this.b, this.c, yihVar, 1, null) : new jau(this.a, this.d, this.b, this.c, yihVar, 0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, pta] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, pta] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.e == 0) {
            ybn.f(obj);
            ArrayList<jat> arrayList = new ArrayList();
            for (Object obj2 : this.a) {
                int i = ((jat) obj2).b;
                arrayList.add(obj2);
            }
            ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
            for (jat jatVar : arrayList) {
                reb rebVar = new reb((char[]) null);
                rebVar.d(jatVar.a);
                arrayList2.add(new ptc(rebVar.c(), jatVar.b));
            }
            ptf ptfVar = new ptf(arrayList2);
            kuw kuwVar = this.d;
            krd.b("Updating chime preferences returned result ".concat(String.valueOf(String.valueOf(kuwVar.b.b(this.b, ptfVar)))));
            return ygi.a;
        }
        ybn.f(obj);
        List<String> list = this.a;
        ArrayList arrayList3 = new ArrayList(yfm.z(list, 10));
        for (String str : list) {
            reb rebVar2 = new reb((char[]) null);
            rebVar2.d(str);
            arrayList3.add(rebVar2.c());
        }
        kuw kuwVar2 = this.d;
        Pair pairA = kuwVar2.b.a(this.b, arrayList3);
        ChimeNotificationSettingsActivity chimeNotificationSettingsActivity = this.c;
        int i2 = ((psy) pairA.first).c;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 1 && pairA.second != null) {
            for (pte pteVar : ((ptb) pairA.second).a) {
                chimeNotificationSettingsActivity.c(pteVar.a.a, pteVar.b);
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jau(List list, kuw kuwVar, String str, ChimeNotificationSettingsActivity chimeNotificationSettingsActivity, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.e = i;
        this.a = list;
        this.d = kuwVar;
        this.b = str;
        this.c = chimeNotificationSettingsActivity;
    }
}
