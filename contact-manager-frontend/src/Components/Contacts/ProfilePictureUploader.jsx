import { useState } from "react";

const ProfilePictureUploader = () => {
  const [profileImage, setProfileImage] = useState(null);
  const [preview, setPreview] = useState(null);

  const handleImageUpload = (e) => {
    const file = e.target.files[0];
    if (file) {
      // Store the file
      setProfileImage(file);
      
      // Generate preview URL
      const previewUrl = URL.createObjectURL(file);
      setPreview(previewUrl);
    }
  };

  const handleSubmit = () => {
    if (profileImage) {
      // You would typically send this to your server for storage or use it directly
      console.log("Profile picture submitted:", profileImage);

      // Example: Use FormData for sending it to a server
      const formData = new FormData();
      formData.append("profileImage", profileImage);

      // Send to backend (example)
      // fetch('/api/upload-profile', { method: 'POST', body: formData });
    }
  };

  return (
    <div>
      <h3>Upload Profile Picture</h3>
      
      {/* Image preview */}
      {preview && <img src={preview} alt="Profile Preview" width="150" height="150" />}
      
      {/* File input */}
      <input type="file" accept="image/*" onChange={handleImageUpload} />
      
      <button onClick={handleSubmit}>Submit</button>
    </div>
  );
};

export default ProfilePictureUploader;
