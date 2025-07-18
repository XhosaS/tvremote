package com.google.android.apps.play.movies.common.service.backup;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import defpackage.idw;
import defpackage.krd;
import defpackage.krh;
import defpackage.meu;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VideosBackupAgent extends BackupAgentHelper {
    public static final /* synthetic */ int a = 0;

    static void a(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, idw idwVar) {
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (idwVar.b(entry.getKey())) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    editor.putString(key, (String) value);
                } else if (value instanceof Set) {
                    editor.putStringSet(key, (Set) value);
                } else if (value instanceof Integer) {
                    editor.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    editor.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    editor.putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    editor.putBoolean(key, ((Boolean) value).booleanValue());
                } else {
                    krd.f("ingnoring invalid preference ".concat(String.valueOf(String.valueOf(value == null ? null : value.getClass()))));
                }
            }
        }
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) throws IOException {
        krd.e(krh.BACKUP_NAME);
        SharedPreferences sharedPreferences = getSharedPreferences(krh.SHARED_NAME, 0);
        SharedPreferences.Editor editorClear = getSharedPreferences(krh.BACKUP_NAME, 0).edit().clear();
        a(sharedPreferences, editorClear, new meu(1));
        editorClear.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, krh.BACKUP_NAME));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        krd.e("restore");
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        SharedPreferences sharedPreferences = getSharedPreferences(krh.BACKUP_NAME, 0);
        SharedPreferences.Editor editorClear = getSharedPreferences(krh.SHARED_NAME, 0).edit().clear();
        a(sharedPreferences, editorClear, new meu(1));
        editorClear.apply();
    }
}
