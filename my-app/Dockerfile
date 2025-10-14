# --------------------------------------------
# Use Node.js as the base image
# --------------------------------------------
FROM node:18

# --------------------------------------------
# Set the working directory inside the container
# --------------------------------------------
WORKDIR /app

# --------------------------------------------
# Copy dependency files and install dependencies
# (This helps leverage Docker layer caching)
# --------------------------------------------
COPY package.json .
RUN npm install

# --------------------------------------------
# Copy the rest of the application source code
# --------------------------------------------
COPY . .

# --------------------------------------------
# Expose the application port
# --------------------------------------------
EXPOSE 3000

# --------------------------------------------
# Command to start the Node.js application
# --------------------------------------------
CMD ["node", "server.js"]
