package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.google.android.tv.remote.service.ImeBridgeService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bny extends bta {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/ImeFeature");
    public int c;
    public bvi d;
    public bvj e;
    public int f;
    public boolean g;
    public int h;
    public bob k;
    private final Context l;
    private int m;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ArrayList i = new ArrayList();
    public WeakReference j = new WeakReference(null);

    public bny(Context context) {
        this.l = context;
    }

    private final void o(int i, clo cloVar) {
        bvw bvwVar = (bvw) cloVar.i();
        ArrayList arrayList = this.i;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((bnx) it.next()).g(i, bvwVar);
            }
        }
    }

    public final void a(bnx bnxVar) {
        ArrayList arrayList = this.i;
        synchronized (arrayList) {
            arrayList.remove(bnxVar);
            if (arrayList.isEmpty()) {
                this.b.post(new bid(this, 6));
            }
        }
    }

    @Override // defpackage.bta
    protected final btc b(bug bugVar) {
        return new bnx(this, bugVar);
    }

    public final void d(bnx bnxVar) {
        int i = this.m + 1;
        this.m = i;
        clo cloVarO = bvw.a.o();
        clg clgVar = clg.a;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bvw bvwVar = (bvw) cloVarO.b;
        clgVar.getClass();
        bvwVar.c = clgVar;
        bvwVar.b = 24;
        bvw bvwVar2 = (bvw) cloVarO.i();
        ArrayList arrayList = this.i;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bnx bnxVar2 = (bnx) it.next();
                if (bnxVar2 != bnxVar && bnxVar2.c) {
                    bnxVar2.g(i, bvwVar2);
                }
            }
        }
    }

    public final void e(int i, CompletionInfo[] completionInfoArr) {
        clo cloVarO = bvg.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bvg bvgVar = (bvg) cloVarO.b;
        bvgVar.b |= 1;
        bvgVar.c = i;
        if (completionInfoArr != null) {
            for (CompletionInfo completionInfo : completionInfoArr) {
                clo cloVarO2 = bvf.a.o();
                long id = completionInfo.getId();
                if (!cloVarO2.b.A()) {
                    cloVarO2.l();
                }
                bvf bvfVar = (bvf) cloVarO2.b;
                bvfVar.b |= 1;
                bvfVar.c = id;
                int position = completionInfo.getPosition();
                if (!cloVarO2.b.A()) {
                    cloVarO2.l();
                }
                bvf bvfVar2 = (bvf) cloVarO2.b;
                bvfVar2.b |= 2;
                bvfVar2.d = position;
                if (completionInfo.getText() != null) {
                    String string = completionInfo.getText().toString();
                    if (!cloVarO2.b.A()) {
                        cloVarO2.l();
                    }
                    bvf bvfVar3 = (bvf) cloVarO2.b;
                    string.getClass();
                    bvfVar3.b |= 4;
                    bvfVar3.e = string;
                }
                if (completionInfo.getLabel() != null) {
                    String string2 = completionInfo.getLabel().toString();
                    if (!cloVarO2.b.A()) {
                        cloVarO2.l();
                    }
                    bvf bvfVar4 = (bvf) cloVarO2.b;
                    string2.getClass();
                    bvfVar4.b |= 8;
                    bvfVar4.f = string2;
                }
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvg bvgVar2 = (bvg) cloVarO.b;
                bvf bvfVar5 = (bvf) cloVarO2.i();
                bvfVar5.getClass();
                cme cmeVar = bvgVar2.d;
                if (!cmeVar.c()) {
                    bvgVar2.d = clt.t(cmeVar);
                }
                bvgVar2.d.add(bvfVar5);
            }
        }
        int i2 = this.m + 1;
        this.m = i2;
        clo cloVarO3 = bvw.a.o();
        if (!cloVarO3.b.A()) {
            cloVarO3.l();
        }
        bvw bvwVar = (bvw) cloVarO3.b;
        bvg bvgVar3 = (bvg) cloVarO.i();
        bvgVar3.getClass();
        bvwVar.c = bvgVar3;
        bvwVar.b = 29;
        o(i2, cloVarO3);
    }

    public final void f() {
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/ImeFeature", "onExternalKeyEvent", 217, "ImeFeature.java")).p("onExternalKeyEvent");
        d(null);
    }

    public final void g(int i, ExtractedText extractedText) {
        bvw bvwVar;
        if (this.f != i) {
            this.j.clear();
        }
        this.f = i;
        int i2 = this.m + 1;
        this.m = i2;
        bvj bvjVarA = bnz.a(i2, extractedText);
        int i3 = this.m;
        this.c = i3;
        this.e = bvjVarA;
        clo cloVarO = bvk.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bvk bvkVar = (bvk) cloVarO.b;
        bvjVarA.getClass();
        bvkVar.d = bvjVarA;
        bvkVar.b |= 2;
        bvw bvwVar2 = bvw.a;
        clo cloVarO2 = bvwVar2.o();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        bvw bvwVar3 = (bvw) cloVarO2.b;
        bvk bvkVar2 = (bvk) cloVarO.i();
        bvkVar2.getClass();
        bvwVar3.c = bvkVar2;
        bvwVar3.b = 22;
        bvw bvwVar4 = (bvw) cloVarO2.i();
        ArrayList arrayList = this.i;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bnx bnxVar = (bnx) it.next();
                if (bnxVar == this.j.get()) {
                    clo cloVarO3 = bvwVar2.o();
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bvk bvkVar3 = (bvk) cloVarO.b;
                    bvkVar3.b |= 1;
                    bvkVar3.c = true;
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    bvw bvwVar5 = (bvw) cloVarO3.b;
                    bvk bvkVar4 = (bvk) cloVarO.i();
                    bvkVar4.getClass();
                    bvwVar5.c = bvkVar4;
                    bvwVar5.b = 22;
                    bvwVar = (bvw) cloVarO3.i();
                } else {
                    bvwVar = bvwVar4;
                }
                bnxVar.g(i3, bvwVar);
            }
        }
    }

    public final void h(int i, EditorInfo editorInfo, int i2, ExtractedText extractedText) {
        bvi bviVar;
        bvj bvjVarA;
        this.j.clear();
        if (i != 0) {
            clo cloVarO = bvi.a.o();
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bvi bviVar2 = (bvi) cloVarO.b;
            bviVar2.b |= 1;
            bviVar2.c = i;
            if (editorInfo.inputType != 0) {
                int i3 = editorInfo.inputType;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar3 = (bvi) cloVarO.b;
                bviVar3.b |= 2;
                bviVar3.d = i3;
            }
            if (editorInfo.imeOptions != 0) {
                int i4 = editorInfo.imeOptions;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar4 = (bvi) cloVarO.b;
                bviVar4.b |= 4;
                bviVar4.e = i4;
            }
            if (editorInfo.privateImeOptions != null) {
                String str = editorInfo.privateImeOptions;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar5 = (bvi) cloVarO.b;
                str.getClass();
                bviVar5.b |= 8;
                bviVar5.f = str;
            }
            if (editorInfo.actionLabel != null) {
                String string = editorInfo.actionLabel.toString();
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar6 = (bvi) cloVarO.b;
                string.getClass();
                bviVar6.b |= 16;
                bviVar6.g = string;
            }
            if (editorInfo.actionId != 0) {
                int i5 = editorInfo.actionId;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar7 = (bvi) cloVarO.b;
                bviVar7.b |= 32;
                bviVar7.h = i5;
            }
            if (editorInfo.initialSelStart != -1) {
                int i6 = editorInfo.initialSelStart;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar8 = (bvi) cloVarO.b;
                bviVar8.b |= 64;
                bviVar8.i = i6;
            }
            if (editorInfo.initialSelEnd != -1) {
                int i7 = editorInfo.initialSelEnd;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar9 = (bvi) cloVarO.b;
                bviVar9.b |= 128;
                bviVar9.j = i7;
            }
            if (editorInfo.initialCapsMode != 0) {
                int i8 = editorInfo.initialCapsMode;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar10 = (bvi) cloVarO.b;
                bviVar10.b |= 256;
                bviVar10.k = i8;
            }
            if (editorInfo.hintText != null) {
                String string2 = editorInfo.hintText.toString();
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar11 = (bvi) cloVarO.b;
                string2.getClass();
                bviVar11.b |= 512;
                bviVar11.l = string2;
            }
            if (editorInfo.label != null) {
                String string3 = editorInfo.label.toString();
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar12 = (bvi) cloVarO.b;
                string3.getClass();
                bviVar12.b |= 1024;
                bviVar12.m = string3;
            }
            if (editorInfo.packageName != null) {
                String str2 = editorInfo.packageName;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar13 = (bvi) cloVarO.b;
                str2.getClass();
                bviVar13.b |= 2048;
                bviVar13.n = str2;
            }
            if (editorInfo.fieldId != 0) {
                int i9 = editorInfo.fieldId;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar14 = (bvi) cloVarO.b;
                bviVar14.b |= 4096;
                bviVar14.o = i9;
            }
            if (editorInfo.fieldName != null) {
                String str3 = editorInfo.fieldName;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bvi bviVar15 = (bvi) cloVarO.b;
                str3.getClass();
                bviVar15.b |= 8192;
                bviVar15.p = str3;
            }
            LocaleList localeList = editorInfo.hintLocales;
            if (localeList != null) {
                for (int i10 = 0; i10 < localeList.size(); i10++) {
                    Locale locale = localeList.get(i10);
                    clo cloVarO2 = bvh.a.o();
                    String language = locale.getLanguage();
                    if (!cloVarO2.b.A()) {
                        cloVarO2.l();
                    }
                    bvh bvhVar = (bvh) cloVarO2.b;
                    language.getClass();
                    bvhVar.b |= 1;
                    bvhVar.c = language;
                    String country = locale.getCountry();
                    if (!cloVarO2.b.A()) {
                        cloVarO2.l();
                    }
                    bvh bvhVar2 = (bvh) cloVarO2.b;
                    country.getClass();
                    bvhVar2.b |= 2;
                    bvhVar2.d = country;
                    String variant = locale.getVariant();
                    if (!cloVarO2.b.A()) {
                        cloVarO2.l();
                    }
                    bvh bvhVar3 = (bvh) cloVarO2.b;
                    variant.getClass();
                    bvhVar3.b |= 4;
                    bvhVar3.e = variant;
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bvi bviVar16 = (bvi) cloVarO.b;
                    bvh bvhVar4 = (bvh) cloVarO2.i();
                    bvhVar4.getClass();
                    cme cmeVar = bviVar16.q;
                    if (!cmeVar.c()) {
                        bviVar16.q = clt.t(cmeVar);
                    }
                    bviVar16.q.add(bvhVar4);
                }
            }
            if (Build.VERSION.SDK_INT >= 25 && editorInfo.contentMimeTypes != null) {
                for (String str4 : editorInfo.contentMimeTypes) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bvi bviVar17 = (bvi) cloVarO.b;
                    str4.getClass();
                    cme cmeVar2 = bviVar17.r;
                    if (!cmeVar2.c()) {
                        bviVar17.r = clt.t(cmeVar2);
                    }
                    bviVar17.r.add(str4);
                }
            }
            bviVar = (bvi) cloVarO.i();
        } else if (editorInfo.packageName == null) {
            bviVar = bvi.a;
        } else {
            clo cloVarO3 = bvi.a.o();
            String str5 = editorInfo.packageName;
            if (!cloVarO3.b.A()) {
                cloVarO3.l();
            }
            bvi bviVar18 = (bvi) cloVarO3.b;
            str5.getClass();
            bviVar18.b |= 2048;
            bviVar18.n = str5;
            bviVar = (bvi) cloVarO3.i();
        }
        clo cloVarO4 = bvo.a.o();
        if (!cloVarO4.b.A()) {
            cloVarO4.l();
        }
        bvo bvoVar = (bvo) cloVarO4.b;
        bviVar.getClass();
        bvoVar.c = bviVar;
        bvoVar.b |= 1;
        if (extractedText != null) {
            this.f = i2;
            int i11 = this.m + 1;
            this.m = i11;
            bvjVarA = bnz.a(i11, extractedText);
            if (!cloVarO4.b.A()) {
                cloVarO4.l();
            }
            bvo bvoVar2 = (bvo) cloVarO4.b;
            bvjVarA.getClass();
            bvoVar2.d = bvjVarA;
            bvoVar2.b |= 2;
        } else {
            this.f = 0;
            bvjVarA = null;
        }
        this.d = bviVar;
        this.e = bvjVarA;
        int i12 = this.m + 1;
        this.m = i12;
        this.c = i12;
        clo cloVarO5 = bvw.a.o();
        if (!cloVarO5.b.A()) {
            cloVarO5.l();
        }
        bvw bvwVar = (bvw) cloVarO5.b;
        bvo bvoVar3 = (bvo) cloVarO4.i();
        bvoVar3.getClass();
        bvwVar.c = bvoVar3;
        bvwVar.b = 20;
        bvw bvwVar2 = (bvw) cloVarO5.i();
        ArrayList arrayList = this.i;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((bnx) it.next()).g(i12, bvwVar2);
            }
        }
    }

    public final void i(int i, int i2) {
        bvj bvjVar = this.e;
        if (bvjVar == null) {
            return;
        }
        int i3 = this.m + 1;
        this.m = i3;
        this.c = i3;
        clo cloVar = (clo) bvjVar.a(5, null);
        cloVar.n(bvjVar);
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        clt cltVar = cloVar.b;
        bvj bvjVar2 = (bvj) cltVar;
        bvjVar2.b |= 4;
        bvjVar2.e = i;
        if (!cltVar.A()) {
            cloVar.l();
        }
        bvj bvjVar3 = (bvj) cloVar.b;
        bvjVar3.b |= 8;
        bvjVar3.f = i2;
        this.e = (bvj) cloVar.i();
        clo cloVarO = bvm.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar2 = cloVarO.b;
        bvm bvmVar = (bvm) cltVar2;
        bvmVar.b |= 1;
        bvmVar.c = i;
        if (!cltVar2.A()) {
            cloVarO.l();
        }
        bvm bvmVar2 = (bvm) cloVarO.b;
        bvmVar2.b |= 2;
        bvmVar2.d = i2;
        bvm bvmVar3 = (bvm) cloVarO.i();
        int i4 = this.m;
        clo cloVarO2 = bvw.a.o();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        bvw bvwVar = (bvw) cloVarO2.b;
        bvmVar3.getClass();
        bvwVar.c = bvmVar3;
        bvwVar.b = 23;
        o(i4, cloVarO2);
    }

    public final void j(boolean z, int i) {
        int i2 = this.m + 1;
        this.m = i2;
        this.c = i2;
        this.g = z;
        this.h = i;
        clo cloVarO = bvw.a.o();
        clo cloVarO2 = bvn.a.o();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        clt cltVar = cloVarO2.b;
        bvn bvnVar = (bvn) cltVar;
        bvnVar.b |= 1;
        bvnVar.c = z;
        if (!cltVar.A()) {
            cloVarO2.l();
        }
        bvn bvnVar2 = (bvn) cloVarO2.b;
        bvnVar2.b |= 2;
        bvnVar2.d = i;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bvw bvwVar = (bvw) cloVarO.b;
        bvn bvnVar3 = (bvn) cloVarO2.i();
        bvnVar3.getClass();
        bvwVar.c = bvnVar3;
        bvwVar.b = 21;
        o(i2, cloVarO);
    }

    public final void k(bob bobVar, boolean z) {
        cbt cbtVar = a;
        ((cbs) ((cbs) cbtVar.c().g(btt.a)).j("com/google/android/tv/remote/service/ImeFeature", "registerIme", 94, "ImeFeature.java")).p("Registering IME");
        if (this.k != null) {
            if (!z) {
                throw new IllegalStateException("IME is already registered");
            }
            ((cbs) cbtVar.g().j("com/google/android/tv/remote/service/ImeFeature", "registerIme", 97, "ImeFeature.java")).p("Replacing running IME with a newer one");
            l();
        }
        this.k = bobVar;
        ArrayList arrayList = this.i;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.k.c();
            } else {
                if (z) {
                    return;
                }
                ((cbs) ((cbs) cbtVar.e().g(btt.a)).j("com/google/android/tv/remote/service/ImeFeature", "registerIme", 113, "ImeFeature.java")).p("IME Being registered without active clients, switch back");
                l();
            }
        }
    }

    public final void l() {
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/ImeFeature", "switchBackIme", 196, "ImeFeature.java")).p("Restoring IME to original");
        bob bobVar = this.k;
        if (bobVar != null) {
            bobVar.b();
        }
        this.c = 0;
        this.d = null;
        this.e = null;
        this.g = false;
        this.h = 0;
    }

    public final void m() {
        String id;
        bob bobVar = this.k;
        if (bobVar != null) {
            bobVar.c();
            return;
        }
        Context context = this.l;
        ContentResolver contentResolver = context.getContentResolver();
        String string = Settings.Secure.getString(contentResolver, "default_input_method");
        cbt cbtVar = a;
        cch cchVarC = cbtVar.c();
        cck cckVar = btt.a;
        ((cbs) ((cbs) cchVarC.g(cckVar)).j("com/google/android/tv/remote/service/ImeFeature", "switchToIme", 169, "ImeFeature.java")).t("Current IME %s", string);
        Iterator<InputMethodInfo> it = ((InputMethodManager) context.getSystemService(InputMethodManager.class)).getInputMethodList().iterator();
        while (true) {
            if (!it.hasNext()) {
                id = null;
                break;
            }
            InputMethodInfo next = it.next();
            if (ImeBridgeService.class.getName().equals(next.getServiceName())) {
                id = next.getId();
                break;
            }
        }
        if (id == null) {
            ((cbs) cbtVar.g().j("com/google/android/tv/remote/service/ImeFeature", "switchToIme", 181, "ImeFeature.java")).p("Could not find the Virtual Remote IME");
        } else {
            if (id.equals(string)) {
                ((cbs) ((cbs) cbtVar.g().g(cckVar)).j("com/google/android/tv/remote/service/ImeFeature", "switchToIme", 186, "ImeFeature.java")).t("IME %s is already active", id);
                return;
            }
            ((cbs) ((cbs) cbtVar.c().g(cckVar)).j("com/google/android/tv/remote/service/ImeFeature", "switchToIme", 190, "ImeFeature.java")).t("Forcing IME to be %s", id);
            Settings.Secure.putInt(contentResolver, "selected_input_method_subtype", -1);
            Settings.Secure.putString(contentResolver, "default_input_method", id);
        }
    }

    public final void n(bob bobVar, boolean z) {
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/ImeFeature", "unregisterIme", 120, "ImeFeature.java")).p("Unregistering IME");
        if (this.k != bobVar) {
            return;
        }
        this.k = null;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.g = false;
        this.h = 0;
        if (z) {
            ArrayList arrayList = this.i;
            synchronized (arrayList) {
                if (!arrayList.isEmpty()) {
                    m();
                }
            }
        }
    }

    @Override // defpackage.bta
    public final void c(bxj bxjVar) {
    }
}
