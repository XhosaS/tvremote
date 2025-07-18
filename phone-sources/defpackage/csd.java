package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csd {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public crx[] i;
    public Set j;
    public csa k;
    public int l;
    public PersistableBundle m;

    public final ShortcutInfo a() {
        int length;
        int length2;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(cmq.n(iconCompat, this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.l);
        PersistableBundle persistableBundle = this.m;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            crx[] crxVarArr = this.i;
            if (crxVarArr != null && (length2 = crxVarArr.length) > 0) {
                Person[] personArr = new Person[length2];
                for (int i = 0; i < length2; i++) {
                    personArr[i] = cri.f(this.i[i]);
                }
                intents.setPersons(personArr);
            }
            csa csaVar = this.k;
            if (csaVar != null) {
                intents.setLocusId(csaVar.b);
            }
            intents.setLongLived(false);
        } else {
            if (this.m == null) {
                this.m = new PersistableBundle();
            }
            crx[] crxVarArr2 = this.i;
            if (crxVarArr2 != null && (length = crxVarArr2.length) > 0) {
                this.m.putInt("extraPersonCount", length);
                int i2 = 0;
                while (i2 < this.i.length) {
                    PersistableBundle persistableBundle2 = this.m;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    String string = sb.toString();
                    crx crxVar = this.i[i2];
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = crxVar.a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString("uri", crxVar.b);
                    persistableBundle3.putString("key", crxVar.c);
                    persistableBundle3.putBoolean("isBot", crxVar.d);
                    persistableBundle3.putBoolean("isImportant", crxVar.e);
                    persistableBundle2.putPersistableBundle(string, persistableBundle3);
                    i2 = i3;
                }
            }
            csa csaVar2 = this.k;
            if (csaVar2 != null) {
                this.m.putString("extraLocusId", csaVar2.a);
            }
            this.m.putBoolean("extraLongLived", false);
            intents.setExtras(this.m);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            intents.setExcludedFromSurfaces(0);
        }
        return intents.build();
    }
}
