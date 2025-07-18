package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qob implements qlz {
    public static final /* synthetic */ int b = 0;
    private static final lnk c;
    private final Context d;
    private final lnm e;
    private final lns f;
    private final lno g;
    private final Executor h;
    private final qlo i;
    private final kcx j;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final lnp k = new lnp() { // from class: qny
        @Override // defpackage.lnp
        public final void a() {
            Iterator it = this.a.a.iterator();
            while (it.hasNext()) {
                ((qly) it.next()).a();
            }
        }
    };

    static {
        lnk lnkVar = new lnk();
        lnkVar.a = 1;
        c = lnkVar;
    }

    public qob(Context context, lnm lnmVar, lns lnsVar, lno lnoVar, qlo qloVar, Executor executor, kcx kcxVar) {
        this.d = context;
        this.e = lnmVar;
        this.f = lnsVar;
        this.g = lnoVar;
        this.h = executor;
        this.i = qloVar;
        this.j = kcxVar;
    }

    public static Object g(zyd zydVar, String str) throws ExecutionException {
        try {
            return zxn.o(zydVar);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if ((cause instanceof kds) || (cause instanceof kdr)) {
                throw e;
            }
            Log.e("OneGoogle", String.format("Failed to load %s. Exception: %s", str, qjs.a(cause)));
            return null;
        }
    }

    private final zyd h(int i) {
        return kdu.d(i) ? zxn.g(new kds(i, "Google Play Services not available", this.j.h(this.d, i, null))) : zxn.g(new kdr(i));
    }

    @Override // defpackage.qlz
    public final zyd a() {
        return b();
    }

    @Override // defpackage.qlz
    public final zyd b() throws PackageManager.NameNotFoundException {
        final zyd zydVarA;
        kcx kcxVar = this.j;
        Context context = this.d;
        qlo qloVar = this.i;
        final zyd zydVarA2 = qloVar.a();
        int iG = kcxVar.g(context, 10000000);
        if (iG != 0) {
            zydVarA = h(iG);
        } else {
            lnm lnmVar = this.e;
            lnk lnkVar = c;
            kev kevVar = lnmVar.j;
            lqc lqcVar = new lqc(kevVar, lnkVar);
            ((kgv) kevVar).a.j(0, lqcVar);
            zydVarA = qoh.a(lqcVar, wyo.a(new yqi() { // from class: qoa
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    boolean z;
                    int i = qob.b;
                    lqh lqhVarC = ((lnl) obj).c();
                    ArrayList arrayList = new ArrayList();
                    kik kikVar = new kik(lqhVarC);
                    while (kikVar.hasNext()) {
                        lpr lprVar = (lpr) kikVar.next();
                        DataHolder dataHolder = lprVar.a;
                        synchronized (dataHolder) {
                            z = dataHolder.i;
                        }
                        if (!z) {
                            arrayList.add(((qnu) qoc.a).apply(lprVar));
                        }
                    }
                    return yyk.j(arrayList);
                }
            }), zwk.a);
        }
        final qls qlsVar = (qls) qloVar;
        final zyd zydVarK = zxn.k(wyo.i(new Callable() { // from class: qlq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = qls.a;
                String str = jwk.a;
                return Arrays.asList(jwq.h(qlsVar.b, strArr));
            }
        }), qlsVar.c);
        return xab.b(zydVarA2, zydVarA, zydVarK).a(new Callable() { // from class: qnz
            @Override // java.util.concurrent.Callable
            public final Object call() throws qlx {
                boolean z;
                List list = (List) qob.g(zydVarA2, "device accounts");
                List<Account> list2 = (List) qob.g(zydVarK, "g1 accounts");
                yyk yykVar = (yyk) qob.g(zydVarA, "owners");
                if (list == null && list2 == null && yykVar == null) {
                    throw new qlx();
                }
                ArrayList arrayList = new ArrayList();
                HashMap map = new HashMap();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        qnw.a(((Account) it.next()).name, arrayList, map);
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (list2 != null) {
                    for (Account account : list2) {
                        if (!z) {
                            qnw.a(account.name, arrayList, map);
                        }
                        qlt qltVar = (qlt) map.get(account.name);
                        if (qltVar != null) {
                            qltVar.h(true);
                        }
                    }
                }
                if (yykVar != null) {
                    int size = yykVar.size();
                    for (int i = 0; i < size; i++) {
                        qlv qlvVar = (qlv) yykVar.get(i);
                        String strA = qlvVar.a();
                        if (!z) {
                            qnw.a(strA, arrayList, map);
                        }
                        qlt qltVar2 = (qlt) map.get(strA);
                        if (qltVar2 != null) {
                            qltVar2.d(qlvVar.d());
                            qltVar2.f(qlvVar.f());
                            qltVar2.e(qlvVar.e());
                            qltVar2.j(qlvVar.g());
                            qltVar2.c(qlvVar.b());
                            qltVar2.g(qlvVar.k());
                        }
                    }
                }
                int i2 = yyk.e;
                yyf yyfVar = new yyf(4);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    yyfVar.g(((qlt) map.get((String) it2.next())).a());
                }
                return yyfVar.f();
            }
        }, zwk.a);
    }

    @Override // defpackage.qlz
    public final void c(qly qlyVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        if (copyOnWriteArrayList.isEmpty()) {
            lns lnsVar = this.f;
            khi khiVarB = khj.b(this.k, lnsVar.h, lnp.class.getName());
            final lpt lptVar = new lpt(khiVarB);
            khv khvVar = new khv() { // from class: lnq
                @Override // defpackage.khv
                public final void a(Object obj, Object obj2) {
                    lpy lpyVar = (lpy) obj;
                    lpp lppVar = (lpp) lpyVar.v();
                    Context context = lpyVar.b;
                    lppVar.e(lptVar, true, 1, knv.a());
                    ((lvj) obj2).a.p(null);
                }
            };
            khv khvVar2 = new khv() { // from class: lnr
                @Override // defpackage.khv
                public final void a(Object obj, Object obj2) {
                    lpy lpyVar = (lpy) obj;
                    lpp lppVar = (lpp) lpyVar.v();
                    Context context = lpyVar.b;
                    lppVar.e(lptVar, false, 0, knv.a());
                    ((lvj) obj2).a.p(true);
                }
            };
            kht khtVar = new kht();
            khtVar.a = khvVar;
            khtVar.b = khvVar2;
            khtVar.c = khiVarB;
            khtVar.f = 2720;
            lnsVar.h(khtVar.a());
        }
        copyOnWriteArrayList.add(qlyVar);
    }

    @Override // defpackage.qlz
    public final void d(qly qlyVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        copyOnWriteArrayList.remove(qlyVar);
        if (copyOnWriteArrayList.isEmpty()) {
            this.f.i(khj.a(this.k, lnp.class.getName()), 2721);
        }
    }

    @Override // defpackage.qlz
    public final zyd e(String str, int i) {
        return f(str, i);
    }

    @Override // defpackage.qlz
    public final zyd f(String str, int i) throws PackageManager.NameNotFoundException {
        int iG = this.j.g(this.d, 10400000);
        if (iG != 0) {
            return h(iG);
        }
        lno lnoVar = this.g;
        int iA = qln.a(i);
        kev kevVar = lnoVar.j;
        lqd lqdVar = new lqd(kevVar, str, iA);
        ((kgv) kevVar).a.j(0, lqdVar);
        return qoh.a(lqdVar, new yqi() { // from class: qnx
            @Override // defpackage.yqi
            public final Object apply(Object obj) throws IOException {
                int i2 = qob.b;
                ParcelFileDescriptor parcelFileDescriptorC = ((lnn) obj).c();
                if (parcelFileDescriptorC == null) {
                    return null;
                }
                try {
                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorC);
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(autoCloseInputStream);
                        autoCloseInputStream.close();
                        return bitmapDecodeStream;
                    } finally {
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }, this.h);
    }
}
