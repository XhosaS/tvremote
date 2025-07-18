package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.format.Formatter;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cyg implements ComponentCallbacks2 {
    private static volatile cyg g;
    private static volatile boolean h;
    public final dcy a;
    public final ddz b;
    public final cyk c;
    public final ddx d;
    public final List e = new ArrayList();
    public final dmw f;
    private final dnl i;
    private final dey j;

    public cyg(Context context, dcy dcyVar, dey deyVar, ddz ddzVar, ddx ddxVar, dnl dnlVar, dmw dmwVar, Map map, List list, List list2, dnv dnvVar, cym cymVar) {
        this.a = dcyVar;
        this.b = ddzVar;
        this.d = ddxVar;
        this.j = deyVar;
        this.i = dnlVar;
        this.f = dmwVar;
        this.c = new cyk(context, ddxVar, new cyu(this, list2, dnvVar), map, list, dcyVar, cymVar);
    }

    public static cyg a(Context context) throws Throwable {
        Object obj;
        boolean z;
        dnk dnkVar;
        we weVar;
        ArrayList arrayList;
        GeneratedAppGlideModule generatedAppGlideModule;
        if (g == null) {
            GeneratedAppGlideModule generatedAppGlideModuleF = f(context.getApplicationContext());
            synchronized (cyg.class) {
                try {
                    try {
                        if (g != null) {
                            obj = cyg.class;
                        } else {
                            if (h) {
                                throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                            }
                            h = true;
                            try {
                                we weVar2 = new we();
                                cyl cylVar = new cyl();
                                Context applicationContext = context.getApplicationContext();
                                List list = Collections.EMPTY_LIST;
                                if (Log.isLoggable("ManifestParser", 3)) {
                                    try {
                                        Log.d("ManifestParser", "Loading Glide modules");
                                    } catch (Throwable th) {
                                        th = th;
                                        z = false;
                                        h = z;
                                        throw th;
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                int i = 2;
                                try {
                                    ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                                    if (applicationInfo != null && applicationInfo.metaData != null) {
                                        if (Log.isLoggable("ManifestParser", 2)) {
                                            Log.v("ManifestParser", "Got app info metadata: " + String.valueOf(applicationInfo.metaData));
                                        }
                                        for (String str : applicationInfo.metaData.keySet()) {
                                            if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                                arrayList2.add(dnz.a(str));
                                                if (Log.isLoggable("ManifestParser", 3)) {
                                                    Log.d("ManifestParser", a.j(str, "Loaded Glide module: "));
                                                }
                                            }
                                        }
                                        if (Log.isLoggable("ManifestParser", 3)) {
                                            Log.d("ManifestParser", "Finished loading Glide modules");
                                        }
                                    } else if (Log.isLoggable("ManifestParser", 3)) {
                                        Log.d("ManifestParser", "Got null app info metadata");
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    if (Log.isLoggable("ManifestParser", 6)) {
                                        Log.e("ManifestParser", "Failed to parse glide modules", e);
                                    }
                                }
                                if (generatedAppGlideModuleF != null && !generatedAppGlideModuleF.b().isEmpty()) {
                                    Set setB = generatedAppGlideModuleF.b();
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        dnx dnxVar = (dnx) it.next();
                                        if (setB.contains(dnxVar.getClass())) {
                                            if (Log.isLoggable("Glide", 3)) {
                                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: ".concat(String.valueOf(String.valueOf(dnxVar))));
                                            }
                                            it.remove();
                                        }
                                    }
                                }
                                if (Log.isLoggable("Glide", 3)) {
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        Log.d("Glide", "Discovered GlideModule from manifest: ".concat(String.valueOf(String.valueOf(((dnx) it2.next()).getClass()))));
                                    }
                                }
                                dnk dnkVarA = generatedAppGlideModuleF != null ? generatedAppGlideModuleF.a() : null;
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    ((dnx) it3.next()).d(applicationContext);
                                }
                                if (generatedAppGlideModuleF != null) {
                                    generatedAppGlideModuleF.d(applicationContext);
                                }
                                int iA = dfj.a();
                                dfj dfjVarA = dff.a(false, iA, iA, "source");
                                dfj dfjVarA2 = dff.a(true, 1, 1, "disk-cache");
                                if (dfj.a() < 4) {
                                    i = 1;
                                }
                                dfj dfjVarA3 = dff.a(true, i, i, "animation");
                                dfa dfaVar = new dfa(applicationContext);
                                Context context2 = dfaVar.a;
                                int i2 = true != dfaVar.b.isLowRamDevice() ? 4194304 : 2097152;
                                int iRound = Math.round(r11.getMemoryClass() * 1048576 * (true != dfaVar.b.isLowRamDevice() ? 0.4f : 0.33f));
                                float f = dfaVar.d.a.widthPixels * dfaVar.d.a.heightPixels * 4;
                                int iRound2 = Math.round(dfaVar.c * f);
                                int iRound3 = Math.round(f + f);
                                int i3 = iRound - i2;
                                int i4 = iRound3 + iRound2;
                                if (i4 > i3) {
                                    float f2 = i3 / (dfaVar.c + 2.0f);
                                    int iRound4 = Math.round(f2 + f2);
                                    int iRound5 = Math.round(f2 * dfaVar.c);
                                    iRound3 = iRound4;
                                    iRound2 = iRound5;
                                }
                                if (Log.isLoggable("MemorySizeCalculator", 3)) {
                                    arrayList = arrayList2;
                                    String fileSize = Formatter.formatFileSize(context2, iRound3);
                                    String fileSize2 = Formatter.formatFileSize(context2, iRound2);
                                    dnkVar = dnkVarA;
                                    obj = cyg.class;
                                    try {
                                        String fileSize3 = Formatter.formatFileSize(context2, i2);
                                        boolean z2 = i4 > iRound;
                                        weVar = weVar2;
                                        String fileSize4 = Formatter.formatFileSize(context2, iRound);
                                        int memoryClass = dfaVar.b.getMemoryClass();
                                        boolean zIsLowRamDevice = dfaVar.b.isLowRamDevice();
                                        StringBuilder sb = new StringBuilder();
                                        generatedAppGlideModule = generatedAppGlideModuleF;
                                        sb.append("Calculation complete, Calculated memory cache size: ");
                                        sb.append(fileSize);
                                        sb.append(", pool size: ");
                                        sb.append(fileSize2);
                                        sb.append(", byte array size: ");
                                        sb.append(fileSize3);
                                        sb.append(", memory class limited? ");
                                        sb.append(z2);
                                        sb.append(", max size: ");
                                        sb.append(fileSize4);
                                        sb.append(", memoryClass: ");
                                        sb.append(memoryClass);
                                        sb.append(", isLowMemoryDevice: ");
                                        sb.append(zIsLowRamDevice);
                                        Log.d("MemorySizeCalculator", sb.toString());
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = false;
                                        h = z;
                                        throw th;
                                    }
                                } else {
                                    dnkVar = dnkVarA;
                                    obj = cyg.class;
                                    weVar = weVar2;
                                    arrayList = arrayList2;
                                    generatedAppGlideModule = generatedAppGlideModuleF;
                                }
                                dmw dmwVar = new dmw();
                                ddz deiVar = iRound2 > 0 ? new dei(iRound2) : new dea();
                                deh dehVar = new deh(i2);
                                dey deyVar = new dey(iRound3);
                                cyg cygVar = new cyg(applicationContext, new dcy(deyVar, new dex(applicationContext), dfjVarA2, dfjVarA, new dfj(new ThreadPoolExecutor(0, Integer.MAX_VALUE, dfj.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new dfi("source-unlimited", false))), dfjVarA3), deyVar, deiVar, dehVar, new dnl(dnkVar), dmwVar, weVar, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new cym(cylVar));
                                applicationContext.registerComponentCallbacks(cygVar);
                                g = cygVar;
                                h = false;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            }
            throw th;
        }
        return g;
    }

    public static czb b(bq bqVar) {
        return c(bqVar.s()).c(bqVar);
    }

    public static dnl c(Context context) {
        dqk.d(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).i;
    }

    private static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
            return null;
        } catch (IllegalAccessException e) {
            g(e);
            return null;
        } catch (InstantiationException e2) {
            g(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            g(e3);
            return null;
        } catch (InvocationTargetException e4) {
            g(e4);
            return null;
        }
    }

    private static void g(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final void d() {
        dqm.f();
        this.j.i(0L);
        this.b.c();
        this.d.b();
    }

    public final void e(int i) {
        dqm.f();
        List<czb> list = this.e;
        synchronized (list) {
            for (czb czbVar : list) {
            }
        }
        dey deyVar = this.j;
        if (i >= 40) {
            deyVar.i(0L);
        } else if (i >= 20) {
            deyVar.i(deyVar.e() / 2);
        } else if (i == 15) {
            i = 15;
            deyVar.i(deyVar.e() / 2);
        }
        this.b.e(i);
        this.d.d(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        d();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        e(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
